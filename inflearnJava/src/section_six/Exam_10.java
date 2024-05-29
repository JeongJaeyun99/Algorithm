package section_six;

import java.util.*;

public class Exam_10 {
	public static int count(int arr[],int distance) {
		int cnt = 1; // dvdÀå¼ö
		int ep = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] - ep >= distance) {
				cnt++;
				ep = arr[i];
			}
		}
		return cnt;
	}
	public static int solution(int n,int m, int arr[]) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 1;
		int rt = Arrays.stream(arr).max().getAsInt();
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(count(arr,mid) >= m) {
				answer = mid;
				lt = mid + 1;
			}else {
				rt = mid - 1;
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
