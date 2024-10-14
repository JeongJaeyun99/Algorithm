package section_8;

import java.util.*;

public class 최대점수_구하기 {
	
	static int num;
	static int maxTime;
	static int answer;
	
	public static void DFS(int L,int sum,int t,int arr[][]) {
		if(t > maxTime) return;
		if(L == num) {
			answer = Math.max(answer,sum);
		}else {
			DFS(L+1,sum+arr[L][0],t+arr[L][1],arr); // 포함 o
			DFS(L+1,sum,t,arr); // 포함 x
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		maxTime = sc.nextInt();
		
		int arr[][] = new int[num][2];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		DFS(0,0,0,arr);
		System.out.println(answer);
	}

}
