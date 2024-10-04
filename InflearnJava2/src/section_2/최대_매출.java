package section_2;

import java.util.Scanner;

public class 최대_매출 {
	
	public static int solution(int a,int k,int arr[]) {
		int now = 0;
		int max = 0;
		for (int i = 0; i < k; i++) {
			max += arr[i];
			now += arr[i];
		}
		for (int i = k; i < arr.length; i++) {
			now -= arr[i-k];
			now += arr[i];
			max = Math.max(max, now);
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(a,k,arr));
	}

}
