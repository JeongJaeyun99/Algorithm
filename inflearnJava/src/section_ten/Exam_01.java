package section_ten;

import java.util.Scanner;

public class Exam_01 {
	
	static int dy[]; // �޸����̼�
	
	public static void solution() {
		for (int i = 3; i < dy.length; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
	}
	// ������ �������� ���� ������ ������ �޸������̼� �ϴ� ����  : ���̳��� ���α׷���
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