package section1;

import java.util.Scanner;

public class 문자찾기 {
	
	public static int solution(String str,char s) {
		int answer = 0;
		for (int i = 0; i < str.length(); i++) {
			String temp = "";
			if(Character.isUpperCase(str.charAt(i))) {
				temp += Character.toLowerCase(str.charAt(i));
			}else {
				temp += str.charAt(i);
			}
			if(temp.equals(s+"")) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String s = sc.next();
		char c = Character.toLowerCase(s.charAt(0));
		System.out.println(solution(str,c));
	}

}
