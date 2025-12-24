package for_japan;

import java.io.*;
import java.util.*;

public class maximum {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int fr = 0;
        int bd = 0;
        String arr[] = new String[9];
        for(int i = 0;i < 9;i++){
            arr[i] = br.readLine();
        }
        for(int i = 0;i < 9;i++){
            StringTokenizer line = new StringTokenizer(arr[i]);
            for(int j = 0;j < 9;j++){
                int a = Integer.parseInt(line.nextToken());
                if(a >= max){
                    max = a;
                    fr = i;
                    bd = j;
                }
            }   
        }
        fr++;
        bd++;
        System.out.println(max + "\n" + fr + " " + bd);
    }
}
