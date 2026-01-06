package for_japan;

import java.io.*;

public class ioioi {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String ioi = "IOI";
        ioi += "OI".repeat(Math.max(0, n - 1));
        int ans = 0;
        for(int i = 0;i < s.length()-ioi.length();i++){
            String temp_str = "";
            for(int j = i;j < i+ioi.length();j++){
                temp_str += s.charAt(j);
            }
            System.out.println();
            if(temp_str.equals(ioi)) ans++; 
        }
        System.out.println(ans);
    }
}
