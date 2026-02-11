package for_japan;

import java.io.*;
import java.util.*;

public class num_jeongsagakheong {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer n_m = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(n_m.nextToken());
        int m = Integer.parseInt(n_m.nextToken());
        int arr[][] = new int[n][m];
        for(int i = 0;i < n;i++){
            String temp[] = br.readLine().split("");
            for(int j = 0;j < m;j++){
                arr[i][j] = Integer.parseInt(temp[j]);
            }
        }
        if(n == 1 || m == 1){
            System.out.println(1);
            return;
        }
        int max = 1;
        int jeongsagakMax = (int)Math.sqrt(n*m);
        boolean check = false;
        for(int i = 1;i < jeongsagakMax;i++){
            for(int j = 0;j < n-i;j++){
                for(int k = 0;k < m-i;k++){
                    if(arr[j][k] == arr[j][k+i] && arr[j][k] == arr[j+i][k] && arr[j][k] == arr[j+i][k+i]){
                        check = true;
                        max = (i+1) * (i+1);
                        //System.out.println("좌표 1 : " + j + "," + k + " 좌표 2 : " + j + "," + (k+i) + " 좌표 3 : " + (j+i) + "," + k + " 좌표 4 : " + j+i + "," + (k+i));
                        break;
                    } 
                }
                if(check){
                    check = false;
                    break;
                }
            }
        }
        System.out.println(max);
    }
}
