package for_japan;

import java.io.*;
import java.util.*;

public class num_cnt {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer nums = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0;i < N;i++){
            int a = Integer.parseInt(nums.nextToken());
            if(a == v) ans++;
        }
        System.out.println(ans);
    }
}
