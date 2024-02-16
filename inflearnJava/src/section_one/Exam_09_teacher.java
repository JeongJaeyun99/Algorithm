package section_one;

import java.util.Scanner;

public class Exam_09_teacher {

	public static int solution(String str) {
		int answer = 0;
		for(char x : str.toCharArray()) {
			if(x >= 48 && x <= 57){
				answer = answer * 10 + (x-48);
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
