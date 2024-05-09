package section_one;

import java.util.Scanner;

public class Exam_11_twice {

	public static String solution(String str) {
		String answer = "";
		answer += str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if(answer.contains(str.charAt(i) + "")) {
				count++;
			}else {
				if(count <= 1) {
					answer += str.charAt(i);					
				}else {
					answer += (count-1);
					answer += str.charAt(i);
					count = 1;					
				}
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
