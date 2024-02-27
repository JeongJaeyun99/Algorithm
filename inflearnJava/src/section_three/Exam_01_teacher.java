package section_three;

import java.util.Scanner;

public class Exam_01_teacher {

	public static StringBuilder solution(int n, int m, int arr1[], int arr2[]) {
		StringBuilder sb = new StringBuilder();
		int p1 = 0, p2 = 0;
		while (p1 < n && p2 < m) {
			if (arr1[p1] < arr2[p2]) {
				sb.append(arr1[p1++] + " ");
			} else {
				sb.append(arr2[p2++] + " ");
			}
		}
		while(p1 < n) {
			sb.append(arr1[p1++] + " ");
		}
		while(p2 < m) {
			sb.append(arr2[p2++] + " ");
		}
		return sb;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println(solution(n, m, arr1, arr2));
	}

}
