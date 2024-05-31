package section_seven;

import java.util.*;
// 피보나치 수열
public class Exam_04 {
	
	static int fibo[];
	public static int DFS(int n) {
		if(fibo[n] > 0) return fibo[n]; // 메모리제이션
		if(n == 1) return fibo[n] = 1;
		else if(n == 2) return fibo[n] =1;
		else {
			return fibo[n] = DFS(n-2) + DFS(n-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibo = new int[n+1];
		DFS(n);
		for (int i = 1; i <= n; i++) {
			System.out.print(fibo[i] + " ");
		}
	}

}
