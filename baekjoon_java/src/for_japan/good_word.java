package for_japan;

import java.util.*;
import java.io.*;

public class good_word {
    static Stack<String> stack = new Stack<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        for(int i = 0;i < n;i++){
            String temp = br.readLine();
            String sp_temp[] = temp.split("");
            stack.push(sp_temp[0]);
            for(int j = 1;j < sp_temp.length;j++){
                String s_temp = sp_temp[j];
                if(!stack.isEmpty()){
                    if(stack.peek().equals(s_temp)){
                        stack.pop();
                    }else{
                        stack.push(s_temp);
                    }    
                }else{
                    stack.push(s_temp);
                }
            }
            if(stack.isEmpty()){
                ans++;
            }
            stack.clear();
        }
        System.out.println(ans);
    }
}
