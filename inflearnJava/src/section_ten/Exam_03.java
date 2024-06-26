package section_ten;

import java.util.*;

public class Exam_03 {
	static int dy[]; 
	
	public static int solution(int arr[]) {
		int answer = 0;
		for (int i = 1; i < arr.length; i++) {
			int max = 0;
			for (int j = i-1; j >= 0; j--) {
				if(arr[i] > arr[j] && dy[j] > max) {
					max = dy[j];
				}
			}
			dy[i] = max + 1;
			answer = Math.max(answer, dy[i]);
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
		dy = new int[n];
		dy[0] = 1;
		solution(arr);
		Arrays.sort(dy);
		System.out.println(dy[n-1]);
	}
}
