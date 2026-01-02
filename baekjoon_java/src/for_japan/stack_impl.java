package for_japan;

import java.util.*;
import java.io.*;

public class stack_impl {
    static ArrayList<Integer> arr = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static void push(String num){
        arr.add(Integer.parseInt(num));
    }

    static void pop(){
        if(arr.size() >= 1){
            sb.append(arr.get(arr.size()-1) + "\n");
            arr.remove(arr.size()-1);
        }else{
            sb.append("-1\n");
        }
    }

    static void empty(){
        if(arr.isEmpty()){
            sb.append("1\n");
        }else{
            sb.append("0\n");
        }
    }

    static void top(){
        if(arr.isEmpty()){
            sb.append("-1\n");
        }else{
            sb.append(arr.get(arr.size()-1) + "\n");
        }
    }

    static void size(){
        sb.append(arr.size() + "\n");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0;i < n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("push")){
                push(st.nextToken());
            }else if(command.equals("pop")){
                pop();
            }else if(command.equals("size")){
                size();
            }else if(command.equals("empty")){
                empty();
            }else if(command.equals("top")){
                top();
            }
        }
        System.out.println(sb);
    }
}
