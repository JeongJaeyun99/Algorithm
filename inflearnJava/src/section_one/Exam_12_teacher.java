package section_one;

import java.util.Scanner;

public class Exam_12_teacher {
	
	public static String solution(int c,String s) {
		String answer = "";
		for (int i = 0; i < c; i++) {
			String tmp = s.substring(0,7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp,2);
			answer += (char)num;
			s = s.substring(7);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String str = sc.next();
		System.out.println(solution(cnt,str));
	}

}
