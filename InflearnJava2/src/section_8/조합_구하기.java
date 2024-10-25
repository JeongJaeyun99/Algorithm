package section_8;

import java.util.*;

public class ����_���ϱ� {

	static int n;
	static int m;
	static int combi[];
	
	public static void DFS(int L,int s) {
		if(L == m) {
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		}else {
			for (int i = s; i <= n; i++) {
				combi[L] = i;
				DFS(L+1,i+1);
			}
			// ���⼭ DFS(0,4) �� ����� 4,4�̰� ��µ��� �ʴ� ����!
			// �켱 combi[0]�� 4�� ���������� ����.
			// ������ combi[1]�� L�� 2�� ������ �����Ƿ�(s�� 5�� �Ǹ� for������ ����) ���� �������� 4�̴�.
			// �׸��� ��µ����ʴ� ������ ���������� L�� 2�� ������ �����Ƿ�!!
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		combi = new int[m];
		DFS(0,1);
	}

}
