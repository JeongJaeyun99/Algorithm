package section_two;

import java.util.Scanner;

public class Exam_04_twice {

	public static int[] solution(int n) {
		int answer[] = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		answer[2] = 2;
		if(n > 3) {
			for (int i = 3; i < answer.length; i++) {
				answer[i] += answer[i-1] + answer[i-2];
			}
			return answer;
		}else {
			return answer;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < solution(n).length; i++) {
			if(i == solution(n).length-1) {
				System.out.print(solution(n)[i]);
			}else {
				System.out.print(solution(n)[i] + " ");
			}
		}
	}

}
