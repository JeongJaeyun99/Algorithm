package for_japan;

import java.io.*;
import java.util.*;

public class chuwall {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<String> q = new LinkedList<>();
        int answer = 0;
        for(int i = 0;i < n;i++){
            String car = br.readLine();
            q.offer(car);
        }
        while(!q.isEmpty()){
            String car2 = br.readLine();
            if(car2.equals(q.peek())){
                q.poll();
            }else{
                answer++;
                q.remove(car2);
            }
        }
        System.out.println(answer);
    }
}
