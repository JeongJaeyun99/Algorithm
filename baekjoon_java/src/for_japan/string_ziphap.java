package for_japan;

import java.io.*;
import java.util.*;

public class string_ziphap {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer n_m = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(n_m.nextToken());
        int m = Integer.parseInt(n_m.nextToken());
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i < n;i++){
            String key = br.readLine();
            map.put(key,map.getOrDefault(key,0) + 1);
        }
        int ans = 0;
        String arr[] = new String[m];
        for(int i = 0;i < m;i++){
            arr[i] = br.readLine();
            if(map.containsKey(arr[i])){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
