package section_two;

import java.util.Scanner;

public class Exam_04 {
	
	public static StringBuilder solution(int n,int arr[]) {
		StringBuilder sb = new StringBuilder();
		arr[0] = 1; 
		arr[1] = 1; 
		sb.append(arr[0] +  " " + arr[1]);
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
			sb.append(" " + arr[i]);
		}
		return sb;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println(solution(n,arr));
	}
	
	

}
