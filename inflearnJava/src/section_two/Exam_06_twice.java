package section_two;

import java.util.Scanner;

public class Exam_06_twice {

	public static StringBuilder solution(int n,String arr[]) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			String tempArr[] = arr[i].split("");
			String temp = "";
			for (int j = tempArr.length-1; j > -1 ; j--) {
				temp+= tempArr[j];
			}
			int num = Integer.parseInt(temp);
			int cnt = 0;
			for (int j = 1; j <= num; j++) {
				if(num % j == 0) {
					cnt++;
				}
				if(cnt > 2) {
					break;
				}
			}
			if(cnt == 2) {
				sb.append(num + " ");
			}
		}
		return sb;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		System.out.println(solution(n,arr));
	}

}
