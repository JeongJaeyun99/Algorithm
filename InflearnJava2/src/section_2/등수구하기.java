package section_2;

import java.util.Scanner;

public class 등수구하기 {

	public static StringBuilder solution(int a,int arr[]) {
		StringBuilder sb = new StringBuilder();
		int rank = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i != j) {
					if(arr[i] < arr[j]) {
						rank++;
					}
				}
			}
			sb.append(rank + " ");
			rank = 1;
		}
		return sb;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(a,arr));
	}

}
