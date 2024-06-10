package section_eight;

import java.util.*;

public class Exam_06 {

	static int n, m = 0;
	static int answer[],ch[];
	static int jumerni[];
	
	public static void DFS(int L) {
		if(L == m) {
			for(int x : answer) System.out.print(x + " ");
			System.out.println();
		}else {
			for (int i = 0; i < n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					answer[L] = jumerni[i];
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		jumerni = new int[n];
		answer = new int[m];
		ch = new int[n];
		for (int i = 0; i < jumerni.length; i++) {
			jumerni[i] = sc.nextInt();
		}
		DFS(0);
	}

}
