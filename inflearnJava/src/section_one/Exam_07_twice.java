package section_one;

import java.util.Scanner;

public class Exam_07_twice {
	
	public static String solution(String str) {
		String answer = "";
		String temp = "";
		String temp2 = "";
		for (int i = str.length()-1; i >= 0; i--) {
			if(Character.isUpperCase(str.charAt(i))) {
				temp += Character.toLowerCase(str.charAt(i));
			}else {
				temp += str.charAt(i);
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				temp2 += Character.toLowerCase(str.charAt(i));
			}else {
				temp2 += str.charAt(i);
			}
		}
		if(temp.equals(temp2)) {
			answer = "YES";
		}else {
			answer = "NO";			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
