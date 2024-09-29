package section1;

import java.util.Scanner;

public class 회문_문자열 {

	public static String solution(String str) {
		String answer = "YES";
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				s1 += Character.toLowerCase(str.charAt(i)) + "";
			}else {
				s1 += str.charAt(i) + "";
			}
		}
		for (int i = s1.length()-1; i >= 0; i--) {
			s2 += s1.charAt(i) + "";
		}
		if(!s1.equals(s2)) answer = "NO";
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
