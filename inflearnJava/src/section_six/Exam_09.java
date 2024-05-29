package section_six;

import java.util.*;

public class Exam_09 {
	public static int count(int arr[],int capacity) {
		int cnt = 1; // dvd장수
		int sum = 0; // dvd를 담는 합
		for(int x : arr) {
			if(sum + x > capacity) {
				cnt++;
				sum = x;
			}else {
				sum += x;
			}
		}
		return cnt;
	}
	
	public static int solution(int n,int m, int arr[]) {
		int answer = 0;
		int lt = Arrays.stream(arr).max().getAsInt(); // 최댓값 얻기 
		int rt = Arrays.stream(arr).sum(); // 배열의 모든 원소들의 합 얻기 
		while(lt <= rt) {
			int mid = (lt+rt) / 2;
			if(count(arr,mid) <= m) {
				answer = mid;
				rt = mid - 1;
			}else {
				lt = mid + 1;
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
