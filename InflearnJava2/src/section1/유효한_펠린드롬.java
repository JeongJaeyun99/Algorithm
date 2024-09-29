package section1;

import java.util.Scanner;

public class 유효한_펠린드롬 {

	public static String solution(String str) {
		String answer = "YES";
		String s1 = "";
		for (int i = 0; i < str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				s1 += Character.toLowerCase(str.charAt(i)) + "";
			}
		}
		for (int i = s1.length()-1; i >= 0; i--) {
			if(s1.charAt(s1.length()-i-1) != s1.charAt(i)) return "NO";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}
