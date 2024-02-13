package section_one;

import java.util.Scanner;

public class Exam_03 {

	public static String solution(String str) {
		String answer = "";
		String arr[] = str.split(" ");
		int max = arr[0].length();
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i].length() > max) {
				max = arr[i].length();
				index = i;
			}
		}
		answer += arr[index];
		return answer;
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}
