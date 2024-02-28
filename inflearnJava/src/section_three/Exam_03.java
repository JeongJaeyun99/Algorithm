package section_three;

import java.util.Scanner;

public class Exam_03 {

	public static int solution(int n,int m,int arr1[]) {
		int sum = 0;
		int answer = 0;
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
		int arr1[]= new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println(solution(n,m,arr1));
	}

}
