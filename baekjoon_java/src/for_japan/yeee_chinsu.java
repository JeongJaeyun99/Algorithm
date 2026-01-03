package for_japan;

import java.io.*;

public class yeee_chinsu {
    static long arr[];
    static long dp(int n){
        if(n <= 3){
            return arr[n];
        }

        if(arr[n] != 0) return arr[n];

        arr[n] = dp(n-1) + dp(n-2);

        return arr[n];

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new long[91];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 2;
        System.out.println(dp(n));
    }
}
