package section_one;

import java.util.Scanner;

public class Exam_03_teacher {

	public static String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE,pos;
		while((pos = str.indexOf(' '))!=-1) {
			String tmp = str.substring(0,pos);
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
			if(str.length()>m) answer=str;
		}
		return answer; 
//		String [] s = str.split(" ");
//		for (String x : s) {
//			int len = x.length();
//			if(len>m) {
//				m = len;
//				answer = x;
//			}
//		}
//		return answer;
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}
