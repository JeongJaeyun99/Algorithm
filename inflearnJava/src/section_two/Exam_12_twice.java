package section_two;

import java.util.Scanner;

public class Exam_12_twice {

	public static int solution(int n , int m , int arr[][]) {
		int answer = 0;
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution( n , m , arr ));
	}

}