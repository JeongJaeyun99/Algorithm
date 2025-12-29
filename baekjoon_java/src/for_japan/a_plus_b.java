package for_japan;

import java.util.*;
import java.io.*;

public class a_plus_b {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        StringTokenizer arr_str = new StringTokenizer(br.readLine());
        for(int i = 0;i < arr.length;i++) arr[i] = Integer.parseInt(arr_str.nextToken());
        int target = Integer.parseInt(br.readLine());
        int ans = 0;
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int sss = arr[left] + arr[right];
            if(sss == target){
                ans++;
                left++;
            }else if(sss < target){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(ans);
    }
}
