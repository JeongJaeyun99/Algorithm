package for_japan;

import java.io.*;
import java.util.*;

public class get_or_default_practice {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer arr_st = new StringTokenizer(br.readLine());
        for(int i = 0;i < arr.length;i++){
            arr[i] = Integer.parseInt(arr_st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        StringTokenizer map_st = new StringTokenizer(br.readLine());
        String arr2[] = new String[m];
        for(int i = 0;i < m;i++){
            String temp = map_st.nextToken();
            map.put(temp,map.getOrDefault(temp,0));
            arr2[i] = temp;
        }
        for(int i = 0;i < arr.length;i++){
            if(map.containsKey(arr[i] + "")){
                map.put(arr[i] + "", map.getOrDefault(arr[i] + "", 0) + 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < m;i++){
            sb.append(map.get(arr2[i]) + " ");
        }
        System.out.println(sb);
    }
}
