package section_eight;

import java.util.*;

public class Exam_03 {

	static int answer = Integer.MIN_VALUE;
	static int exam, totalTime = 0;

	public static void DFS(int L, int sum ,int time,int arr[][]) {
		if (time > totalTime)
			return;
		if (L == exam) {
			answer = Math.max(answer,sum);
		} else {
			DFS(L + 1, sum + arr[L][0] , time + arr[L][1],arr);
			DFS(L + 1, sum,time, arr);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		exam = sc.nextInt();
		totalTime = sc.nextInt();
		int arr[][] = new int[exam][2]; // 문제번호,시간
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		DFS(0, 0, 0,arr);
		System.out.println(answer);
	}

}
