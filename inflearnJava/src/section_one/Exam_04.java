package section_one;

import java.util.Scanner;

public class Exam_04 {

	public static StringBuilder solution(String arr[],StringBuilder sb) {
		for (int i = 0; i < arr.length; i++) {
			String temp[] = arr[i].split("");
			for (int j = temp.length-1; j >= 0 ; j--) {
				sb.append(temp[j]);
			}
			sb.append("\n");
		}
		return sb;
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		System.out.println(solution(arr,sb));
	}

}
