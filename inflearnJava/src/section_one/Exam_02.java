package section_one;

import java.util.Scanner;

public class Exam_02 {

	public static String solution(String str) {
		int answer = 0;
		String str2[] = str.split("");
		String str3 = "";
		for (int i = 0; i < str2.length; i++) {
			if(str2[i].charAt(0) < 97) {
				str2[i] = str2[i].toLowerCase();
			}else {
				str2[i] = str2[i].toUpperCase();
			}
			str3 += str2[i];
		}
		return str3;
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
