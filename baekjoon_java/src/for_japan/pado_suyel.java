package for_japan;

import java.io.*;

public class pado_suyel {
    static long arr[];
    static long banbok(int n){
        if(n <= 1){
            return n;
        }
        if(arr[n] != 0) return arr[n];

        arr[n] = banbok(n - 3) + banbok(n - 2);
        return arr[n];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        arr = new long[100+1];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 0;i < t;i++){
            int n = Integer.parseInt(br.readLine());
            long a = banbok(n);
            sb.append(a + "\n");
        }
        System.out.println(sb);
    }
}
