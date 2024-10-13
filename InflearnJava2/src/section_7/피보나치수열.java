package section_7;

import java.util.*;

public class 피보나치수열 {
	
	static int arr[];
	
	public static int DFS(int a) {
		if(arr[a] > 0) return arr[a];
		if(a == 1) {
			return arr[a] = 1;
		}else if (a == 2){
			return arr[a] = 1;
		}else {
			return arr[a] = DFS(a-2) + DFS(a-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		arr = new int[a+1];
		DFS(a);
		for (int i = 1; i <= a; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
