package section_two;

import java.util.Scanner;

public class Exam_07 {

	public static int solution(int n,int arr[]) {
		int answer = 0;
		int cnt = 1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				answer++;
				if(cnt > 1) {
					for (int j = 0; j < cnt-1; j++) {
						answer++;
					}
				}
				cnt++;
			}else {
				cnt = 1;
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
