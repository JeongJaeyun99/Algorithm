package for_japan;

import java.io.*;
import java.util.*;

public class bunsu_hap {

    static int eu(int a,int b){
        if(b == 0){
            return a;
        }
        return eu(b,a%b);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer a_bunsu = new StringTokenizer(br.readLine());
        int a_up = Integer.parseInt(a_bunsu.nextToken());
        int a_down = Integer.parseInt(a_bunsu.nextToken());
        StringTokenizer b_bunsu = new StringTokenizer(br.readLine());
        int b_up = Integer.parseInt(b_bunsu.nextToken());
        int b_down = Integer.parseInt(b_bunsu.nextToken());
        int gongyaksu = 0;
        if(a_down < b_down){
            gongyaksu = eu(b_down,a_down);
        }else{
            gongyaksu = eu(a_down, b_down);
        }
        int gongbesu = (a_down * b_down) / gongyaksu;
        a_up *= (gongbesu  / a_down);
        b_up *= (gongbesu  / b_down);
        int a_b_up = a_up + b_up;
        if(a_b_up / gongbesu != 0){
            int temp = a_b_up;
            a_b_up = a_b_up / gongbesu;
            gongbesu = gongbesu / (temp % gongbesu);
        }else if(gongbesu / a_b_up  != 0){
            int temp = a_b_up;
            a_b_up = a_b_up / gongbesu;
            gongbesu = gongbesu / (temp % gongbesu);
        }
        System.out.println(a_b_up + " " + gongbesu);
    }
}
