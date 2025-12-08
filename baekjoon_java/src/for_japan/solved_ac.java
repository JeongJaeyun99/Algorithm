package for_japan;

import java.io.*;
import java.util.*;

public class solved_ac {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// 意見の数が多いから(0 ≤ n ≤ 3 × 105)
        int a = Integer.parseInt(br.readLine());
        // ここから切る基準を決める過程です。
        float b = a;
        b *= 15;
        b /= 100;
        b = Math.round(b);
        int real_avr = (int)b;
        int arr[] = new int[a];
        for(int i = 0;i < a;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int answer = 0;
        for(int i = real_avr;i < a-real_avr;i++){
            answer += arr[i];
        }
        // System.out.println("平均 : " + real_avr);
        // System.out.println("答え : " + answer);
        System.out.println(Math.round((float)(answer) / (a - (real_avr*2))));
    }
}
