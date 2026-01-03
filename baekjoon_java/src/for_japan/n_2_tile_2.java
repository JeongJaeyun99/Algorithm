package for_japan;

import java.io.*;

public class n_2_tile_2 {
    static long arr[];
    static long dp(int n){
        if(n <= 3){
            return arr[n];
        }

        if(arr[n] != 0) return arr[n];

        arr[n] = (dp(n-1) + 2*dp(n-2));

        arr[n] %= 10007;

        return arr[n];
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new long[1000+1];
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 5;
        long ans = dp(n);
        System.out.println(ans);
    }
}
