package for_japan;

import java.io.*;
import java.util.*;

public class danchukkey {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<>();
        String first = br.readLine();
        sb.append("[" + first.charAt(0) + "]" + first.substring(1, first.length()));
        set.add(first.charAt(0) + "");
        if(first.charAt(0))
        set.add(first.charAt(0) + "");
        for(int i = 1;i < n;i++){
            String key = br.readLine();
            Boolean check = false;
            if(key.contains(" ")){
                StringTokenizer st = new StringTokenizer(key);
                for(int j = 0;j < st.countTokens();j++){
                    String temp = st.nextToken();
                    if(!set.contains(temp.charAt(0)) || ){

                    }
                }
            }
        }
    }
}
