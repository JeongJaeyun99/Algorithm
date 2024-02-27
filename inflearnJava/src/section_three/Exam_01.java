package section_three;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_01 {

	public static StringBuilder solution(int n,int m,int arr1[],int arr2[]) {
		int answer = 0; 
		StringBuilder sb = new StringBuilder();
		int arr[] = new int[n+m];
		int temp = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr[i] = arr1[i];
			temp++;
		}
		for (int i = 0; i < arr2.length; i++) {
			arr[temp] = arr2[i];
			temp++;
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		
		return sb;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[]= new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[]= new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println(solution(n,m,arr1,arr2));
	}

}
