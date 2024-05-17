package section_three;

import java.util.*;

public class Exam_04_twice {

	public static int solution(int n, int m, int arr[]) {
		int answer = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i; j < arr.length; j++) {
				temp += arr[j];
				if(temp == m) {
					answer++;
					break;
				}else if(temp > m){
					break;
				}
			}
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
