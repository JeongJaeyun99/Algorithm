package for_japan;

import java.io.*;

public class zoo {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[100001];
        arr[1] = 3;
        arr[2] = 7;
        for(int i = 3;i <= n;i++){
            arr[i] = arr[i-2] + (arr[i-1] * 2);
            arr[i] %= 9901;
        }
        System.out.println(arr[n]);
    }
}
