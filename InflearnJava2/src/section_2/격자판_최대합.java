package section_2;

import java.util.*;

public class 격자판_최대합 {

	public static int solution(int a,int arr[][]) {
		int answer = 0;
		int crossMax1 = 0;
		int crossMax2 = 0;
		int hangMax = Integer.MIN_VALUE;
		int yellMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i == j) crossMax1 += arr[i][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length-1; j >= 0; j--) {
				if((i + j) == (arr.length-1)) {
					crossMax2 += arr[i][j];
				}
			}
		}
		answer = Math.max(crossMax1, crossMax2);
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[i][j];
			}
			if(sum > hangMax) hangMax = sum;
		}
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			if(sum > yellMax) yellMax = sum;
		}
		answer = Math.max(answer, hangMax);
		answer = Math.max(answer, yellMax);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(a,arr));
	}

}
