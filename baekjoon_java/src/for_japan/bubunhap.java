package for_japan;

import java.io.*;
import java.util.*;

public class bubunhap {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer n_s = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(n_s.nextToken());
        String s_temp = n_s.nextToken();
        if(s_temp.equals("0")){
            System.out.println(0);
            return;
        }
        int s = Integer.parseInt(s_temp);
        StringTokenizer arr_str = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = Integer.parseInt(arr_str.nextToken());
        }
        int left = 0;
        int right = 0;
        int ans = n+1;
        int hap = 0;
        int cnt = 0;
        while(left < n && right < n){
            if(hap >= s){
                ans = Math.min(right - left, ans);
                hap -= arr[left];
                left++;
            }else{
                hap += arr[right];
                right++;
            }
        }
        System.out.println(ans + " " + left + " " + right);
    }
}
