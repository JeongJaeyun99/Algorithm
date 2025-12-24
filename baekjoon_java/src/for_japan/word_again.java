package for_japan;

import java.io.*;
import java.util.*;

public class word_again {

    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0;i < T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String alpa[] = st.nextToken().split("");
            for(int j = 0;j < alpa.length;j++){
                for(int k = 0;k < R;k++){
                    sb.append(alpa[j]);
                }    
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
