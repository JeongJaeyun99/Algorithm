package for_japan;

import java.io.*;
import java.util.*;

public class fast_a_b {
    static StringBuilder sb = new StringBuilder();
    static void plus(int a, int b){
        sb.append((a+b)+"\n");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0;i < T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            plus(a,b);
        }
        System.out.println(sb);
    }
}
