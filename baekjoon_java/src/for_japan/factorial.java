package for_japan;

import java.io.*;

public class factorial {

    static int factorial_kaisan(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial_kaisan(n-1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(factorial_kaisan(n));
    }
}
