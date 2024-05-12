package section_two;

import java.util.Scanner;

public class Exam_07_twice {

	public static int solution(int n,int arr[]) {
		int answer = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				cnt++;
				answer += cnt;
			}else {
				cnt = 0;
			}
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
		System.err.println(solution(n,arr));
	}

}
