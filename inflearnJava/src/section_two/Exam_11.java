package section_two;

import java.util.Scanner;

public class Exam_11 {

	public static int solution(int n,int arr[][]) {
		int answer = 0; // 최종 임시 회장 학생 번호
		int cnt[] = new int[n];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < n-1; j++) {
				if(arr[j][i] == arr[j+1][i]) {
				}
			}
		}
		return answer+1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][5];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.err.println(solution(n,arr));
	}

}
