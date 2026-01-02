package for_japan;

import java.util.*;
import java.io.*;

public class stack_impl2 {
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
            if(command.equals("1")){
                push(st.nextToken());
            }else if(command.equals("2")){
                pop();
            }else if(command.equals("3")){
                size();
            }else if(command.equals("4")){
                empty();
            }else if(command.equals("5")){
                top();
            }
        }
        System.out.println(sb);
    }
}

