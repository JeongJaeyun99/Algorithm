package section_two;

import java.util.Scanner;

public class Exam_02_teacher {

	public static int solution(int n,int arr[]) {
		int cnt = 1;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				cnt++;
				max = arr[i];
			}
		}
		return cnt;
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
