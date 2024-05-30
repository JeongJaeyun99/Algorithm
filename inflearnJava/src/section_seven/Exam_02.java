package section_seven;

import java.util.*;

public class Exam_02 {
	
	public static void DFS(int n) {
		if(n == 1) {
			System.out.print(1);
		}else {
			DFS(n / 2);
			System.out.print(n % 2); 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		DFS(n);
	}

}
