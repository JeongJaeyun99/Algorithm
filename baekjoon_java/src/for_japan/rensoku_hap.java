package for_japan;

import java.io.*;
import java.util.*;

public class rensoku_hap {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = arr[0];
        for(int i = 1;i < arr.length;i++){
            arr[i] = Math.max(arr[i] , arr[i-1]+ arr[i]);
            if(arr[i] > max) max = arr[i];  
        }
        System.out.println(max);
    }
}
