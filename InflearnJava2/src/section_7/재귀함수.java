package section_7;

import java.util.*;

public class ����Լ� {
	
	public static void DFS(int a) {
		if(a == 0) {
			return;
		}
		else {
			DFS(a-1);
			System.out.print(a + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		DFS(a);
	}

}
