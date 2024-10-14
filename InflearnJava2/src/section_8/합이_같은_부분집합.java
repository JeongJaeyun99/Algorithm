package section_8;

import java.util.*;

public class ����_����_�κ����� {
	
	static int a;
	static int arr[];
	static int total;
	static String answer = "NO";
	static boolean flag = false;
	static Queue<Integer> q = new LinkedList<>();
	
	public static void DFS(int L,int sum) {
		if(flag) return;
		if(sum > total/2) return;
		if(L == a) {
			if(total - sum == sum) {
				answer = "YES";
				flag = true;
			}
		}else {
			DFS(L+1,sum + arr[L]); // ���� o
			DFS(L+1,sum); // ���� x
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		arr = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		DFS(0,0);
		System.out.println(answer);
	}

}
