package section_eight;

import java.util.*;

public class Exam_09 {

	static int answer[];
	static int n, m = 0;

	public static void DFS(int L,int s) {
		if (L == m) {
			for (int i : answer) {
				System.out.print(i + " ");
			}
			System.out.println();
		} else {
			for (int i = s; i <= n; i++) {
				answer[L] = i;
				DFS(L + 1,i+1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		answer = new int[m];
		DFS(0,1);
	}

}
