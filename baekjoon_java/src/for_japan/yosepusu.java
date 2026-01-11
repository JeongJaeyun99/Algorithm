package for_japan;

import java.io.*;
import java.util.*;

public class yosepusu {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer n_m = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(n_m.nextToken());
        int m = Integer.parseInt(n_m.nextToken());
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 1;i <= n;i++) q.add(i);
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            if(cnt % m == 0){
                sb.append(" " + q.poll() + ",");
                cnt++;
            }else{
                q.add(q.poll());
                cnt++;
            }
        }
        sb.setCharAt(0, '<');
        sb.setCharAt(sb.length()-1, '>');
        System.out.println(sb);
    }
}
