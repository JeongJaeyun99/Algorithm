package for_japan;

import java.io.*;

public class worng_tile {
    static long arr[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n == 1){
            System.out.println(1);
            return;
        }
        arr = new long[n + 1];
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3;i <= n;i++){
            arr[i] = (arr[i - 1] + arr[i - 2]) % 15746;
        }
        System.out.println(arr[n]);
    }
}

// import java.io.*;

// public class worng_tile {
//     static long arr[];
//     static long dp(int n){
//         if(n < 1){
//             return 0;
//         }
//         if(arr[n] != 0) return arr[n];

//         arr[n] = (dp(n - 1) + dp(n - 2)) % 15746;
//         return arr[n];
//     }
//     public static void main(String[] args) throws IOException{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         arr = new long[1000000];
//         arr[1] = 1;
//         arr[2] = 2;
//         arr[3] = 3;
//         arr[4] = 5;
//         System.out.println(dp(Integer.parseInt(br.readLine())));
//     }
// }
