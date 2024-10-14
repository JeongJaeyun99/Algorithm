package section_7;

import java.util.Scanner;

public class �κ�����_���ϱ� {
	
	static int ch[]; // ����ߴ��� ���ߴ��� check
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
			DFS(L+1); // ���� ���� use O
			ch[L] = 0;
			DFS(L+1); // ���������� ���� use X
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		ch = new int[a+1];
		DFS(1);
	}

}
