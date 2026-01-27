package for_japan;

import java.io.*;
import java.util.*;

public class gopsem_long {

    public static long power(long a, long n,long c) {
        // 기저 조건: 어떤 수의 0제곱은 1
        if (n == 0) return 1;

        // 지수를 절반으로 나누어 재귀 호출
        long half = power(a, n / 2,c);

        // 맨 마지막에 나누면 범위를 넘어서서 스택오버플로우가 나므로 할때마다 나눠준다.
        long temp = (half * half) % c;
        
        // 지수가 짝수라면
        if (n % 2 == 0) {
            return temp;
        } 
        // 지수가 홀수라면 (밑을 한 번 더 곱해주는데, 오버플로우가 안나게 c로 나눠준다. 그런데 temp * a 과정에서도 오버플로우가 날수도 있으므로 c로 나눠준다.)
        else {
            return (temp * (a % c)) % c;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        System.out.println(power(a, b, c));
    }
}
