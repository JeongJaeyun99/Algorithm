package section_two;

import java.util.Scanner;

public class Exam_08_teacher {

	public static int[] solution(int arr[]) {
		int answer[] = new int[arr.length];
		for (int i = 0; i < answer.length; i++) {
			int cnt = 1;
			for (int j = 0; j < answer.length; j++) {
				if(arr[j] > arr[i]) cnt++;
			}
			answer[i] = cnt;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int x : solution(arr)) {
			System.out.print(x + " ");
		}
	}

}
