package section_8;

import java.util.*;

public class ¹ÙµÏÀÌ_½ÂÂ÷ {
	
	static int max;
	static int num;
	static int answer;
	
	public static void DFS(int L,int sum,int arr[]) {
		if(sum > max) return;
		if(L == num) {
			answer = Math.max(answer,sum);
		}else {
			DFS(L+1,sum + arr[L],arr); // Æ÷ÇÔ o
			DFS(L+1,sum,arr); // Æ÷ÇÔ x
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		max = sc.nextInt();
		num = sc.nextInt();
		
		int arr[] = new int[num];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		DFS(0,0,arr);
		System.out.println(answer);
	}

}
