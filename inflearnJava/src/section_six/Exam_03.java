package section_six;

import java.util.Scanner;

public class Exam_03 {
	public static int[] solution(int n, int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i-1; j >= 0; j--) {
				if(arr[j] > temp) {
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}