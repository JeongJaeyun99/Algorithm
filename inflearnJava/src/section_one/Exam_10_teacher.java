package section_one;

import java.util.Scanner;

public class Exam_10_teacher {

	public static int[] solution(String str1,char c) {
		int answer[] = new int[str1.length()];
		int p = 1000;
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i) == c) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		for (int i = str1.length()-1; i >= 0; i--) {
			if(str1.charAt(i) == c) {
				p = 0;
			}else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		char c = sc.next().charAt(0);
		for(int x : solution(str1,c)) {
			System.out.print(x + " ");
		}

	}

}
