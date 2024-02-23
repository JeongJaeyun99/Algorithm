package section_two;

import java.util.Scanner;

public class Exam_06 {

	public static StringBuilder solution(int n,String arr[]) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			String temp[] = arr[i].split("");
			String temp2 = "";
			for (int j = temp.length-1; j >= 0 ; j--) {
				temp2 += temp[j];
			}
			int temp3 = Integer.parseInt(temp2);
			int cntTemp = 0;
			for (int j = 1; j <= temp3; j++) {
				if(temp3 % j == 0) {
					cntTemp++;
				}
				if(cntTemp > 2) {
					break;
				}
			}
			if(cntTemp == 2) {
				sb.append(temp3 + " ");
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
