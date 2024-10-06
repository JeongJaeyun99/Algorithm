package section_5;

import java.util.*;

public class 공주구하기	 {
	
	public static int solution(int a,int k) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= a; i++) {
			q.add(i);
		}
		while(!q.isEmpty()) {
			for (int i = 1; i < k; i++) q.add(q.remove());
			q.remove();
			if(q.size() == 1) answer = q.remove();
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(solution(a,k));
	}
}
