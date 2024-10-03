package section_2;

import java.util.*;

public class 에라토스테네스_체 {

	public static int solution(int a) {
		int answer = 0;
		int arr[] = new int[a+1];
		for (int i = 2; i <= a; i++) {
			if(arr[i] == 0) {
				answer++;
				for (int j = i; j <= a; j+=i) arr[j] = 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(solution(a));
	}

}
