package section_ten;

import java.util.Scanner;

public class Exam_01 {
	
	static int dy[]; // 메모리제이션
	
	public static void solution() {
		for (int i = 3; i < dy.length; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
	}
	// 문제를 여러개의 작은 단위로 나누고 메모이제이션 하는 문제  : 다이나믹 프로그래밍
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int[n+1];
		dy[1] = 1;
		dy[2] = 2;
		solution();
		System.out.println(dy[n]);
	}

}
