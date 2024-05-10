package section_two;

import java.util.Scanner;

public class Exam_03_twice {

	public static StringBuilder solution(int n,int arr1[],int arr2[]) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if(arr1[i] == 1) {
				if(arr2[i] == 1) {
					sb.append("D\n");
				}else if(arr2[i] == 2) {
					sb.append("B\n");
				}else {
					sb.append("A\n");
				}
			}else if(arr1[i] == 2) {
				if(arr2[i] == 1) {
					sb.append("A\n");
				}else if(arr2[i] == 2) {
					sb.append("D\n");
				}else {
					sb.append("B\n");
				}
			}else if(arr1[i] == 3){
				if(arr2[i] == 1) {
					sb.append("B\n");
				}else if(arr2[i] == 2) {
					sb.append("A\n");
				}else {
					sb.append("D\n");
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
		int arr2[] = new int[n];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();			
		}
		System.out.println(solution(n,arr1,arr2));
	}

}
