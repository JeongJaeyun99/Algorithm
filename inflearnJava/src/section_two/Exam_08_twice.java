package section_two;

import java.util.Scanner;

public class Exam_08_twice {

	public static StringBuilder solution(int n,int arr[]) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			int rank = 1;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					rank++;
				}
			}
			sb.append(rank + " ");
		}
		return sb;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n,arr));
	}

}
