package for_japan;

import java.io.*;
import java.util.*;

public class under_prime {

    static boolean isPrime(int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;

        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int answer = 0;
        for(int j = start;j <= end;j++){
            int n = j;
            int cnt = 0;
            for (int i = 2; i * i <= n; i++) {
                while (n % i == 0) {
                    cnt++;
                    n /= i;
                }
            }

            if (n > 1) {
                cnt++;
            }
            int temp = cnt;
            if(isPrime(temp)){
                answer++;
            }
        }
        System.out.println(answer);
    } 
}
