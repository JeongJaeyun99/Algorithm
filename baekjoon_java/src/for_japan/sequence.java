package for_japan;

import java.io.*;
import java.util.*;

public class sequence {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer n_k = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(n_k.nextToken());
        int k = Integer.parseInt(n_k.nextToken());
        StringTokenizer arr_str = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i = 0;i < arr.length;i++) arr[i] = Integer.parseInt(arr_str.nextToken());
        int left = 0;
        int right = k-1;
        int ans = Integer.MIN_VALUE;
        while(right <= arr.length-1){
            int temp = 0;
            for(int i = left;i <= right;i++) temp+=arr[i];
            if(temp > ans){
                ans = temp;
                left++;
                right++;
            }else{
                left++;
                right++;
            }
        }
        System.out.println(ans);
    }
}
