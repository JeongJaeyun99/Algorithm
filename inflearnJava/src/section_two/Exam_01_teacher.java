package section_two;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_01_teacher {

	public static ArrayList<Integer> solution(int n,int arr[]) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : solution(n,arr)) {
			System.out.println(x + " ");
		}
	}

}
