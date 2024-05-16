package section_three;

import java.util.*;

public class Exam_02_twice {

	public static StringBuilder solution(int n, int arr1[], int m, int arr2[]) {
		StringBuilder sb = new StringBuilder();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					sb.append(arr1[i] + " ");
					break;
				}
			}
		}
		
		return sb;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.print(solution(n, arr1, m, arr2));
	}

}
