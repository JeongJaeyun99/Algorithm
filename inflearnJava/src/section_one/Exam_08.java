package section_one;

import java.util.Scanner;

public class Exam_08 {
	
	public static String solution(String str) {
		String answer = "NO";
		str = str.toLowerCase().replaceAll("[^a-z]",""); // ^는 부정 >> a부터 z까지가 아니라면 공백으로 대체
		StringBuilder sb = new StringBuilder(str);
		String temp = sb.reverse().toString();
		if(str.equals(temp)) {
			return "YES";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}
