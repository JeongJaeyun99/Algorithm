package section_three;

import java.util.Scanner;

public class Exam_04 {

	public static int solution(int n,int m,int arr[]) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if(sum == m) {
					cnt++;
					break;
				}else if(sum > m) {
					break;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[]= new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n,m,arr));
	}

}
