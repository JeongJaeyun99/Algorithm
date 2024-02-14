package section_one;

import java.util.Scanner;

public class Exam_07_teacher {

	public static String solution(String str) {
		String answer = "NO";
		str = str.toUpperCase();
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
				return "YES";
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
