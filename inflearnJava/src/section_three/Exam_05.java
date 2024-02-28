package section_three;

import java.util.Scanner;

public class Exam_05 {

	public static int solution(int n) {
		int cnt = 0;
		for (int i = 1; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += j;
				if(sum == n) {
					cnt++;
					break;
				}else if(sum > n) {
					break;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

}
