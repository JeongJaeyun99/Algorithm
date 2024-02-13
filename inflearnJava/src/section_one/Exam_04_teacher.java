package section_one;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_04_teacher {

	public static ArrayList<String> solution(int n,String arr[]) {
		ArrayList<String> answer = new ArrayList<String>();
		for(String x : arr) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		for(String x : solution(n,arr)){
			System.out.println(x);
		}
	}

}
