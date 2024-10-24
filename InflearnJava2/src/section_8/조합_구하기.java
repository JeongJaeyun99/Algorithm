package section_8;

import java.util.*;

public class 조합_구하기 {

	static int n;
	static int r;
	static int combi[];
	
	public static int DFS(int n,int r) {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		r = sc.nextInt();
		combi = new int[r];
		System.out.println(DFS(n,r));
	}

}
