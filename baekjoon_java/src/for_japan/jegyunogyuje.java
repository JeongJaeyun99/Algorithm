package for_japan;

import java.io.*;

public class jegyunogyuje{

    static int recursion_cnt = 0;

    public static int recursion(String s, int l, int r){
        recursion_cnt++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException{
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i < t;i++){
            String text = br.readLine();
            sb.append(isPalindrome(text) + " " + recursion_cnt + "\n");
            recursion_cnt = 0;
        }
        System.out.println(sb);
    }
}