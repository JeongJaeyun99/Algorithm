package greedy;

import java.util.Scanner;

public class Exam_13305 {
	// 문제이름 : 주유소
	
	static int distance[];
	static int price[];
	static int answer = Integer.MAX_VALUE;
	static int disSum;
	
	public static void solution(int L,int dis,int sum) {
		if(dis == disSum) {
			answer = Math.min(answer, sum);
			return;
		}else {
			solution(L+1,dis+distance[L],sum+(distance[L] * price[L]));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		distance = new int[n-1];
		for (int i = 0; i < distance.length; i++) {
			distance[i] = sc.nextInt();
			disSum += distance[i];
		}
		price = new int[n];
		for (int i = 0; i < price.length; i++) {
			price[i] = sc.nextInt();
		}
		solution(0,0,0);
		System.out.println(answer);
	}

}
