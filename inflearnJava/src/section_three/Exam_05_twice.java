package section_three;

import java.util.*;

public class Exam_05_twice {

	public static int solution(int n) {
		int answer = 0;
		for (int i = 1; i < n; i++) {
			int temp = 0;
			for (int j = i; j < n; j++) {
				temp += j;
				if(temp == n) {
					answer++;
					break;
				}else if(temp > n) {
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(solution(n));
	}

}
