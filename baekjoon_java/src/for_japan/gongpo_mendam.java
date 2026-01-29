package for_japan;

import java.io.*;
import java.util.*;

public class gongpo_mendam {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int arr[] = new int[t];
        for(int i = 0;i < t;i++){
            StringTokenizer temp = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(temp.nextToken());
            for(int j = 0;j < cnt;j++){
                arr[i] += Integer.parseInt(temp.nextToken());
            }
        }
        Arrays.sort(arr);
        long ans = arr[0];
        for(int i = 1;i < arr.length;i++){
            arr[i] += arr[i-1];
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
