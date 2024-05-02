package section_one;

import java.util.Scanner;

public class Exam_02_twice {
	
	public static String solution(String str) {
		String answer = "";
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				answer += Character.toLowerCase(str.charAt(i));
			}else if(Character.isLowerCase(str.charAt(i))){
				answer += Character.toUpperCase(str.charAt(i));
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
