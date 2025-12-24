package for_japan;

import java.io.*;
import java.util.*;

public class over_average {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        for(int i = 0;i < C;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int avr = 0;
            int arr[] = new int[N];
            for(int j = 0;j < N;j++){
                int num = Integer.parseInt(st.nextToken());
                arr[j] = num;
                avr+= num;
            }
            avr /= N;
            double ans = 0;
            for(int k = 0;k < arr.length;k++){
                if(arr[k] > avr){
                    ans++;
                }
            }
            ans /= N;
            ans *= 100;
            String formatted = String.format("%.3f", ans);
            sb.append(formatted + "%\n");
        }
        System.out.println(sb);
    }
}