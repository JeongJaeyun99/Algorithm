package section_three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exam_02 {

	public static ArrayList<Integer> solution(int n, int m, int arr1[], int arr2[]) {
		int p1 = 0, p2 = 0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (p1 < n && p2 < m) {
			if (arr1[p1] == arr2[p2]) {
				list.add(arr1[p1++]);
				p2++;
			} else if (arr1[p1] > arr2[p2]) {
				p2++;
			} else {
				p1++;
			}
		}
		return list;

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
		for (int x : solution(n, m, arr1, arr2)) {
			System.out.print(x + " ");
		}
	}
}
