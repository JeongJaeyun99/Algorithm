package section_one;

import java.util.Scanner;

public class Exam_07 {
	
	public static String solution(String str) {
		String answer = "NO";
		String realStr = "";
		for(char a : str.toCharArray()) {
			if(Character.isUpperCase(a)) {
				realStr += Character.toLowerCase(a);
			}else {
				realStr += a;
			}
		}
		String arr[] = realStr.split("");
		String str2 = "";
		for (int i = arr.length-1; i > -1; i--) {
			str2 += arr[i];
		}
		if(realStr.equals(str2)) {
			answer = "YES";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
