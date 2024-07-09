package greedy;

import java.util.Scanner;

public class Exam_13305 {
	// 문제이름 : 주유소
	
	static int distance[];
	static int price[];
	static long answer = 0;
	static int disSum;
	
	public static void solution() {
		int minPrice = Integer.MAX_VALUE;
		for (int i = 0; i < price.length-1; i++) {
			if(minPrice > price[i]) minPrice = price[i];
		}
		if(minPrice == price[0]) answer = price[0] * disSum;
		else {
			answer += price[0] * distance[0];
			disSum -= distance[0];
			for (int i = 1; i < distance.length; i++) {
				for (int j = i; j < price.length-1; j++) {
					if(minPrice > price[j]) minPrice = price[j];
				}
				if(price[i] == minPrice) {
					answer += price[i] * disSum;
					break;
				}else {
					answer += price[i] * distance[i];
					disSum -= distance[i];
				}
			}
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
		solution();
		System.out.println(answer);
	}

}
