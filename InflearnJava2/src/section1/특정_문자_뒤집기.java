package section1;

import java.util.Scanner;

public class 특정_문자_뒤집기 {
	
	public static String solution(String str) {
		String answer = "";
		int lt = 0;
		int rt = str.length()-1;
		char c[] = str.toCharArray();
		while(lt<rt) {
			if(!Character.isAlphabetic(c[lt])) {
				lt++;
			}else if(!Character.isAlphabetic(c[rt])) {
				rt--;
			}else {
				char temp = c[lt];
				c[lt] = c[rt];
				c[rt] = temp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(c);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
