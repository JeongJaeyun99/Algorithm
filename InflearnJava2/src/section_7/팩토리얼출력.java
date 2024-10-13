package section_7;

import java.util.*;

public class 팩토리얼출력 {
	
	public static int DFS(int a) {
		if(a == 1) {
			return 1;
		}else {
			return a*DFS(a-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(DFS(a));
	}

}
