package section1;

import java.util.Scanner;

public class ���ڸ�_���� {
	
	public static int solution(String str) {
		String answer = "";
		answer = str.replaceAll("[^0-9]", "");
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
