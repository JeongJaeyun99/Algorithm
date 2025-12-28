package for_japan;

import java.io.*;
import java.util.*;

public class jumong {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer arr_str = new StringTokenizer(br.readLine());
        int arr[] = new int[N];
        for(int i = 0;i < N;i++) arr[i] = Integer.parseInt(arr_str.nextToken());
        int left = 0; // 왼쪽 index
        int right = arr.length-1; // 오른쪽 index
        int ans = 0; // 답을 저장할 변수
        Arrays.sort(arr);
        while(left < right){
            if(arr[left] + arr[right] == M){
                ans++;
                left++;
                right--;
            }else if(arr[left] + arr[right] < M){
                left++;
            }else if(arr[left] + arr[right] > M){
                right--;
            }
        }
        System.out.println(ans);
    }
}
