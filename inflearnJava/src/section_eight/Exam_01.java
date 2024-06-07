package section_eight;

import java.util.*;

public class Exam_01 {
	
	static String answer = "NO";
	static int n,total=0;
	static boolean flag = false; // yes발견되면 그 다음 재귀 다 재낀다.
	public static void DFS(int L,int sum,int arr[]) {
		if(flag) return; // 맞는것이 나오면 그 다음 재귀 다 재끼면 된다.
		if(sum > total / 2) return; // sum이 total의 절반을 넘으면 의미 X이므로
		if(L == n) {
			if((total-sum) == sum) {
				answer = "YES";
				flag = true;
			}
		}
		else {
			DFS(L+1,sum+arr[L],arr); // L번째 사용하겠다.
			DFS(L+1,sum,arr); // L번째 사용하지않겠다.
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		DFS(0,0,arr);
		System.out.println(answer);
	}

}
