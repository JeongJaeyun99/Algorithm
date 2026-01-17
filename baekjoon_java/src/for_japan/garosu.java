package for_japan;

import java.io.*;
import java.util.*;

public class garosu {
    static Long eu(Long a,Long b){
        if(b == 0){
            return a;
        }
        return eu(b,a%b);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long arr[] = new long[n];
        for(int i = 0;i < arr.length;i++){
            arr[i] = Long.parseLong(br.readLine());
        }
        ArrayList<Long> temp = new ArrayList<>();
        for(int i = 1;i < arr.length;i++){
            temp.add(arr[i] - arr[i-1]);
        }
        Long [] minus_arr = temp.toArray(new Long[0]);
        Long min_num = eu(Math.max(minus_arr[0], minus_arr[1]), Math.min(minus_arr[0], minus_arr[1]));
        for(int i = 2;i < minus_arr.length;i++){
            if(min_num < minus_arr[i]){
                min_num = eu(minus_arr[i], min_num);
            }else{
                min_num = eu(min_num, minus_arr[i]);
            }
        }
        long total_trees = (arr[arr.length - 1] - arr[0]) / min_num + 1;
        System.out.println(total_trees - n);
    }
}
