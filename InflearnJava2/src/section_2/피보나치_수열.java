package section_2;

import java.util.*;

public class 피보나치_수열 {

	public static StringBuilder solution(int a) {
		StringBuilder sb = new StringBuilder();
		int arr[] = new int[a];
		arr[0] = 1;
		arr[1] = 1;
		sb.append("1 1");
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-2] + arr[i-1];
			sb.append(" " + arr[i]);
		}
		return sb;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(solution(a));
	}

}
