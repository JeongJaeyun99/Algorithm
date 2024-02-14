package level0;

import java.util.Scanner;

public class 대소문자_바꿔서_출력하기 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        for(char b : a.toCharArray()){
            if(Character.isUpperCase(b)) {
            	answer+= Character.toLowerCase(b);
            }else {
            	answer+= Character.toUpperCase(b);
            }
        }
        System.out.println(answer);
    }

}
