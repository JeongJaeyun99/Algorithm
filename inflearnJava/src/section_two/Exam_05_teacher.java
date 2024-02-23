package section_two;

import java.util.Scanner;

public class Exam_05_teacher {
	// 에라토스테네스 체
	public static int solution(int n) {
		int cnt = 0;
		int arr[] = new int[n+1];
		for (int i = 2; i < arr.length; i++) {
			if(arr[i] == 0) {
				cnt++;
				for (int j = i; j <= n; j+=i) {
					arr[j] = 1;
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
