package section_one;

import java.util.Scanner;

public class Exam_04_twice {
	
	public static void solution(String arr[]) {
		String answer[] = arr;
		for (int i = 0; i < arr.length; i++) {
			String temp[] = arr[i].split("");
			String tempStr = "";
			for (int j = temp.length-1; j >= 0; j--) {
				 tempStr += temp[j];
			}
			answer[i] = tempStr;
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		solution(arr);
	}

}
