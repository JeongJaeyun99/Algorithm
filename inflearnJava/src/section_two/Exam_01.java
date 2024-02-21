package section_two;

import java.util.Scanner;

public class Exam_01 {

	public static String solution(int n,int arr[]) {
		String answer = arr[0]+ " ";
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1] < arr[i]) {
				if(i == arr.length-1) {
					answer += arr[i];
				}else {
					answer += arr[i] + " ";					
				}
			}
		}
		return answer;
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
