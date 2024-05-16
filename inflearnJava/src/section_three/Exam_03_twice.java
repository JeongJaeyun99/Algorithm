package section_three;

import java.util.*;

public class Exam_03_twice {

	public static long solution(int n, int m, int arr1[]) {
		long sum = 0;
		long answer = 0;
		for (int j = 0; j < m; j++) {
			sum += arr1[j];
		}
		answer = sum;
		for (int i = m; i < arr1.length; i++) {
			sum += (arr1[i] - arr1[i-m]);
			answer = Math.max(answer, sum);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.print(solution(n, m, arr1));
	}

}
