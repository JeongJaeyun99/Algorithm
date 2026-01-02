package for_japan;

import java.util.*;
import java.io.*;

public class zero {
    static Stack<Integer> stack = new Stack<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        for(int i = 0;i < k;i++){
            int command = Integer.parseInt(br.readLine());
            if(!stack.isEmpty()){
                if(command == 0){
                    stack.pop();
                    continue;
                }
            }
            stack.push(command);
        }
        int sum = 0;
        for(Integer item : stack){
            sum += item;
        }
        System.out.println(sum);
    }
}
