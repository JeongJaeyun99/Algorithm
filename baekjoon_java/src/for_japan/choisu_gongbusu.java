package for_japan;

import java.io.*;
import java.util.*;

public class choisu_gongbusu {
    static long eu(long a,long b){
        if(b == 0){
            return a;
        }
        return eu(b,a%b);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer a_b = new StringTokenizer(br.readLine());
        long a = Long.parseLong(a_b.nextToken());
        long b = Long.parseLong(a_b.nextToken());
        long gongyaksu = 0;
        if(a < b){
            gongyaksu = eu(b, a);
        }else{
            gongyaksu = eu(a, b);
        }
        long ans = (a * b) / gongyaksu;
        if(ans == 1){
            System.out.println(a*b);
        }else{
            System.out.println(ans);
        }
    }
}
