package section_one;

import java.util.Scanner;

public class Exam_03_twice {
	
	public static String solution(String str) {
		String answer = "";
		int max = Integer.MIN_VALUE;
		String arr[] = str.split(" ");
		for(String x : arr) {
			if(x.length() > max) {
				max = x.length();
				answer = x;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}
