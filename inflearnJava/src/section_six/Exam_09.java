package section_six;

import java.util.*;

public class Exam_09 {
	public static int count(int arr[],int capacity) {
		int cnt = 1; // dvd���
		int sum = 0; // dvd�� ��� ��
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
		int lt = Arrays.stream(arr).max().getAsInt(); // �ִ� ��� 
		int rt = Arrays.stream(arr).sum(); // �迭�� ��� ���ҵ��� �� ��� 
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
