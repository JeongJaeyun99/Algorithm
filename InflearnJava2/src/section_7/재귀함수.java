package section_7;

import java.util.*;

public class ����Լ� {
	
	public static void DFS(int l,int a) {
		if(l == a) {
			System.out.print(l);
			return;
		}
		else {
			System.out.print(l + " ");
			DFS(l+1,a);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int l = 1;
		DFS(l,a);
	}

}
