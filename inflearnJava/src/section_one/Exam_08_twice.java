package section_one;

import java.util.Scanner;

public class Exam_08_twice {
	
	public static String solution(String str) {
		String answer = "NO";
		str = str.toLowerCase().replaceAll("[^a-z]", "");
		String temp = new StringBuilder(str).reverse().toString();
		if(str.equals(temp)) {
			answer = "YES";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}
