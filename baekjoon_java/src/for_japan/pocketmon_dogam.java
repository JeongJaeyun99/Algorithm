package for_japan;

import java.io.*;
import java.util.*;

public class pocketmon_dogam {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,String> map1 = new HashMap<Integer,String>();
        HashMap<String,Integer> map2 = new HashMap<String,Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i = 0;i < n;i++){
            String num_name = br.readLine();
            map1.put(i+1,num_name);
            map2.put(num_name,i+1);
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i < m;i++){
            String input = br.readLine();
            boolean hasAlphabet = input.matches(".*[a-zA-Z].*");
            if(hasAlphabet){
                ans.append(map2.get(input) + "\n");
            }else{
                ans.append(map1.get(Integer.parseInt(input)) + "\n");
            }
        }
        System.out.println(ans);
    }
}
