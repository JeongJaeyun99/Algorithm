package level_2;

import java.util.*;
import java.math.*;

public class Exam_15829 {

    public static void solution(int L, String str) {
        BigInteger sum = BigInteger.ZERO;
        
        for (int i = 0; i < str.length(); i++) {
            BigInteger value = BigInteger.valueOf(str.charAt(i) - 96);

            BigInteger multiplier = BigInteger.valueOf(31).pow(i);

            value = value.multiply(multiplier);

            sum = sum.add(value);
        }

        System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String str = sc.next();
        solution(L, str);
    }
}
