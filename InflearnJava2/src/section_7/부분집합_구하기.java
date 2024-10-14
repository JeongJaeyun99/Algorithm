package section_7;

import java.util.Scanner;

public class 부분집합_구하기 {
	
	static int ch[]; // 사용했는지 안했는지 check
	static int a;
	
	public static void DFS(int L) {
		if(L == a+1) {
			for (int i = 1; i < ch.length; i++) {
				if(ch[i] == 1) System.out.print(i + " ");
			}
			System.out.println();
			return;
		}else {
			ch[L] = 1;
			DFS(L+1); // 왼쪽 뻗기 use O
			ch[L] = 0;
			DFS(L+1); // 오른쪽으로 뻗기 use X
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		ch = new int[a+1];
		DFS(1);
	}

}
