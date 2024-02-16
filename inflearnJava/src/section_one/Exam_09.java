package section_one;

import java.util.Scanner;

public class Exam_09 {

	public static int solution(String str) {
		String temp = str.replaceAll("[^0-9]", "");
		int answer = Integer.parseInt(temp);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));

	}

}
