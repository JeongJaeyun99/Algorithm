package section_two;

import java.util.Scanner;

public class Exam_10_twice {

	public static int solution(int n,int arr[][]) {
		int answer = 0;
		for (int i = 1; i < (n+2); i++) {
			for (int j = 1; j < (n+2); j++) {
				if(arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i][j+1] && arr[i][j] > arr[i+1][j]) {
					answer++;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n+2][n+2];
		for (int i = 0; i < n+2; i++) {
			for (int j = 0; j < n+2; j++) {
				if(i == 0 || i == n+1 || j == 0 || j == n+1) {
					arr[i][j] = 0;
				}else {
					arr[i][j] = sc.nextInt();
				}
			}
		}
		System.out.println(solution(n,arr));
	}

}