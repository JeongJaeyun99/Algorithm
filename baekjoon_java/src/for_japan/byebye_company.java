package for_japan;

import java.io.*;
import java.util.*;

public class byebye_company {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n+1][2];
        for(int i = 1;i <= n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int dp[] = new int[n+2];
        for(int i = n;i >= 1;i--){
           int time = arr[i][0];
           int price = arr[i][1];

           if(i + time <= n + 1){
                dp[i] = Math.max(price + dp[i + time],dp[ i + 1 ]);
           }else{
                dp[i] = dp[i+1];
           }
            
        }
        System.out.println(dp[1]);
    }
}
