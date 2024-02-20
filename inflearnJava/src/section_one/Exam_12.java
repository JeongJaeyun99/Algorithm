package section_one;

import java.util.Scanner;

public class Exam_12 {
	
	public static String solution(int c,String s) {
		String answer = "";
		String arr[] = s.split("");
		int start = 0;
		for (int i = 0; i < c; i++) {
			String temp = "";
			int temp3 = 0;
			for (int j = start; j < start + 7; j++) {
				temp += arr[j];
			}
			String arr2[] = temp.split("");
			for (int k = 0; k <= 6; k++) {
				if(arr2[6-k].equals("#")) {
					temp3 += Math.pow(2, k);
				}
			}
			answer += (char)temp3;
			start += 7;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String str = sc.next();
		System.out.println(solution(cnt,str));
	}

}
