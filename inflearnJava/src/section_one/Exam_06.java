package section_one;

import java.util.Scanner;

public class Exam_06 {

	public static String solution(String str) {
		String answer = "";
		String temp[] = str.split("");
		answer += temp[0];
		for (int i = 1; i < temp.length; i++) {
			if(!answer.contains(temp[i])) {
				answer += temp[i];
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
