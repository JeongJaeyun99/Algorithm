package section_7;

import java.util.*;

public class 이진수출력 {
	
	public static void DFS(int a) {
		if(a == 0) {
			return;
		}
		else {
			DFS(a/2);
			System.out.print(a%2 + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		DFS(a);
	}

}
