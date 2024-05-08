package section_one;

import java.util.Scanner;

public class Exam_09_twice {
	
	public static int solution(String str) {
		String answerStr= "";
		int answer = 0;
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isAlphabetic(str.charAt(i))) {
				answerStr += str.charAt(i);
			}
		}
		answer = Integer.parseInt(answerStr);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
