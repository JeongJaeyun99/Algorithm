package section_six;

import java.util.Scanner;

public class Exam_04 {
	public static int[] solution(int n,int m ,int work[]) {
		int cache[] = new int[n];
		for(int x : work) {
			int pos = -1;
			for(int i = 0;i < n;i++) if(x == cache[i]) pos = i;
			if(pos == -1) {
				for (int i = n-1; i > 0; i--) {
					cache[i] = cache[i-1];
				}
				cache[0] = x;
			}else {
				for (int i = pos; i > 0; i--) {
					cache[i] = cache[i-1];					
				}
				cache[0] = x;
			}
		}
		return cache;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int work[] = new int[m];
		for (int i = 0; i < work.length; i++) {
			work[i] = sc.nextInt();
		}
		for (int x : solution(n,m,work)) {
			System.out.print(x + " ");
		}
	}
}
