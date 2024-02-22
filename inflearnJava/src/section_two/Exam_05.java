package section_two;

import java.util.Scanner;

public class Exam_05 {

	public static int solution(int n) {
		int cnt = 1;
		for (int i = 3; i <= n; i+=2) {
			int temp = 0;
			for (int j = 1; j <= i; j++) {
				if(i % j == 0) {
					temp++;
				}
				if(temp > 2) {
					break;
				}
			}
			if(temp == 2) {
				cnt++;
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
