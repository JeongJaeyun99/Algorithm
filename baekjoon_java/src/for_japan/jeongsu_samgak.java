package for_japan;

import java.io.*;
import java.util.*;

public class jeongsu_samgak {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n+1][n+1];
        for(int i = 1;i <= n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1;j <= i;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        if(n == 1){
            System.out.println(arr[1][1]);
            return;
        }else if(n == 2){
            int ans = arr[1][1];
            ans += Math.max(arr[2][1], arr[2][2]);
            System.out.println(ans);
            return;
        }
        arr[2][1] += arr[1][1];
        arr[2][2] += arr[1][1];
        for(int i = 3;i < arr.length;i++){
            arr[i][1] += arr[i-1][1];
            for(int j = 2;j <= i-1;j++){
                arr[i][j] += Math.max(arr[i-1][j-1], arr[i-1][j]); 
            }
            arr[i][i] += arr[i-1][i-1];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 1;i <= n;i++){
            if(max < arr[n][i]) max = arr[n][i];
        }
        System.out.println(max);
    }
}
