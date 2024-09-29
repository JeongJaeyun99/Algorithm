package section1;

import java.util.Scanner;

public class 문장_속_단어 {
	
	public static String solution(String str) {
		int max = Integer.MIN_VALUE;
		String answer = "";
		String []str2 = str.split(" ");
		for(String x : str2) {
			int len = x.length();
			if(len > max) {
				max = len;
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
