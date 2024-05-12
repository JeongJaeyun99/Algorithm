package section_two;

import java.util.Scanner;

public class Exam_09_twice {

	public static int solution(int n,int arr[][]) {
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		int max4 = 0;
		int answer = 0;
		for (int i = 0; i < n; i++) {
			int temp1 = 0;
			for (int j = 0; j < n; j++) {
				temp1 += arr[i][j];
			}
			if(max1 < temp1) {
				max1 = temp1;
			}
		}
		for (int i = 0; i < n; i++) {
			int temp2 = 0;
			for (int j = 0; j < n; j++) {
				temp2 += arr[j][i];
			}
			if(max2 < temp2) {
				max2 = temp2;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			max3 += arr[i][i];
		}
		for (int i = 0; i < arr.length; i++) {
			max4 += arr[n-i-1][i];
		}
		int temp1 = Math.max(max1, max2);
		int temp2 = Math.max(max3, max4);
		answer = Math.max(temp1, temp2);
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(n,arr));
	}

}