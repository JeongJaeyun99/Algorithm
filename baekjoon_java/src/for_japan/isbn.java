package for_japan;

import java.io.*;

public class isbn {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();
        String arr[] = isbn.split("");
        int answer = 0;
        int index = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i].equals("*")){
                index = i;
            }else{
                int a = Integer.parseInt(arr[i]);
                if(i % 2 == 1){
                    answer += a * 3;
                }else{
                    answer += a;
                }
            }
        }
        int real = 10 - (answer%10);
        if(index % 2 == 1){
            while(true){
                if(real % 3 != 0){
                    real += 10;
                }else{
                    break;
                }
            }
            real /= 3;
        }
        if(real == 10){
            real = 0;
        }
        System.out.println(real);
    }
}
