package for_japan;

import java.io.*;
import java.util.StringTokenizer;

public class rgb_kyouri {
    static int cost[][];
    static int n;
    static int min;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        cost = new int[n+1][3];
        for(int i = 1;i < cost.length;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0;j < 3;j++){
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 2;i <= n;i++){
            cost[i][0] = cost[i][0] + Math.min(cost[i-1][1] , cost[i-1][2]);
            cost[i][1] = cost[i][1] + Math.min(cost[i-1][0] , cost[i-1][2]);
            cost[i][2] = cost[i][2] + Math.min(cost[i-1][0] , cost[i-1][1]);
        }
        min = cost[n][0];
        for(int i = 1;i < 3;i++){
            if(cost[n][i] < min) min = cost[n][i];
        }
        System.out.println(min);
    }
}
