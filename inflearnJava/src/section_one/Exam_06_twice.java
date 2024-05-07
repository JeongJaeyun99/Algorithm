package section_one;

import java.util.Scanner;

public class Exam_06_twice {
	
	public static String solution(String str) {
		String answer = str.charAt(0) + "";
		for (int i = 1; i < str.length(); i++) {
			if(!answer.contains("" + str.charAt(i))) {
				answer += str.charAt(i);
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
