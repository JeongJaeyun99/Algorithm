package section_2;

import java.util.*;

public class 큰_수_출력하기 {

	public static StringBuilder solution(int a,int arr[]) {
		StringBuilder sb = new StringBuilder();
		sb.append(arr[0] + " ");
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1] < arr[i]) sb.append(arr[i] + " ");
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
