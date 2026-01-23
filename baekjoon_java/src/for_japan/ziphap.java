package for_japan;

import java.io.*;
import java.util.*;

public class ziphap {
    static ArrayList<Integer> list = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    static void all(){
        list = new ArrayList<>(List.of(1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19, 20));
    }

    static void empty(){
        list.clear();
    }

    static void add(int x){
        list.add(x);
    }

    static void remove(int x){
        list.remove(Integer.valueOf(x));
    }

    static void check(int x){
        if(list.contains(x)){
            sb.append(1 +"\n");
        }else{
            sb.append(0 +"\n");
        }
    }

    static void toggle(int x){
        if(list.contains(x)){
            remove(x);
        }else{
            add(x);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0;i < t;i++){
            String command = br.readLine();
            if(command.equals("all")){
                all();
            }else if(command.equals("empty")){
                empty();
            }else{
                StringTokenizer st = new StringTokenizer(command);
                String command1 = st.nextToken();
                int command2 = Integer.parseInt(st.nextToken());
                if(command1.equals("add") && !list.contains(command2)){
                    add(command2);
                }else if(command1.equals("remove") && list.contains(command2)){
                    remove(command2);
                }else if(command1.equals("check")){
                    check(command2);
                }else if(command1.equals("toggle")){
                    toggle(command2);
                }
            }
        }
        System.out.println(sb);
    }
}
