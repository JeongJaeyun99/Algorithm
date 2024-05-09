package section_one;

import java.util.Scanner;

public class Exam_10_twice {

	public static int[] solution(String str1, String str2) {
		int answer[] = new int[str1.length()];
		int p = 1000;
		for (int i = 0; i < answer.length; i++) {
			if((str1.charAt(i) + "").equals(str2)) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		p = 1000;
		for (int i = answer.length-1; i > -1; i--) {
			if((str1.charAt(i) + "").equals(str2)) {
				p = 0;
			}else {
				p++;
				answer[i] = Math.min(answer[i],p);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		for (int i = 0;i < solution(str1, str2).length; i++) {
			if(i == solution(str1, str2).length-1) {
				System.out.print(solution(str1, str2)[i]);
			}else {
				System.out.print(solution(str1, str2)[i] + " ");
			}
		}
	}

}
