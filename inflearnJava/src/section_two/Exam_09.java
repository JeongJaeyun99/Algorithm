package section_two;

import java.util.Scanner;

public class Exam_09 {

	public static int solution(int n,int arr[][]) {
		int answer = 0;
		int sum1 = 0; // ㅡ
		int sum2 = 0; // ㅣ
		int sum3 = 0; // / : 대각선
		int sum4 = 0; // \ : 대각선
		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = 0; j < n; j++) {
				temp += arr[i][j];
			}
			if(sum1 < temp) {
				sum1 = temp;
			}
		}
		for (int j = 0; j < n; j++) {
			int temp = 0;
			for (int i = 0; i < n; i++) {
				temp += arr[i][j];				
			}
			if(sum2 < temp) {
				sum2 = temp;
			}
		}
		if(sum1 > sum2) {
			answer = sum1;
		}else {
			answer = sum2;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i == j) {
					sum3 += arr[i][j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if((i + j) == (n-1)) {
					sum4 += arr[i][j];
				}
			}
		}
		if(sum3 < sum4) {
			sum3 = sum4;
		}
		if(answer < sum3) {
			answer = sum3;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.err.println(solution(n,arr));
	}

}
