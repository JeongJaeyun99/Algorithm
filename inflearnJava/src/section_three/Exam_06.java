package section_three;

import java.util.Scanner;

public class Exam_06 {

	public static int solution(int n, int m, int arr[]) {
		int answer = 0;
		int lt = 0;
		int cnt = 0;
		for (int rt = 0; rt < n; rt++) {
			if(arr[rt] == 0) cnt++;
			while (cnt > m) {
				if(arr[lt] == 0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt-lt+1);
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(solution(n, m, arr));
	}

}
