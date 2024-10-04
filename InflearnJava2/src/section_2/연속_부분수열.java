package section_2;

import java.util.Scanner;

public class 연속_부분수열 {
	
	public static int solution(int n,int m,int arr[]) {
		int answer = 0;
		int now = 0;
		int startIndex = 0;
		now += arr[0];
		int index = 1;
		while(true) {
			if(index == arr.length) {
				if(now < m) {
					break;
				}else if(now > m) {
					now -= arr[startIndex];
					startIndex++;
				}else if(now == m){
					answer++;
					now -= arr[startIndex];
					startIndex++;
				}
			}else {
				if(now == m) {
					answer++;
					now -= arr[startIndex];
					startIndex++;
				}else if(now < m) {
					now += arr[index];
					index++;
				}else if(now > m) {
					now -= arr[startIndex];
					startIndex++;
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
		System.out.println(solution(n,m,arr));
	}

}
