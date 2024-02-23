package section_two;

import java.util.Scanner;

public class Exam_08 {

	public static int[] solution(int arr[]) {
		int answer[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int rank = 1;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					rank++;
				}
			}
			answer[i] = rank;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : solution(arr)) {
			System.out.print(x + " ");
		}
	}

}
