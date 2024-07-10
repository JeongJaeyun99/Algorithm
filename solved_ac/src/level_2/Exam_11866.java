package level_2;

import java.util.*;

public class Exam_11866 {
	static ArrayList<Integer> answer = new ArrayList<>();
	
	public static void solution(int n,int k) {
		Queue<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		while(!q.isEmpty()) {
			for (int i = 0; i < k-1; i++) {
				q.offer(q.poll());
			}
			answer.add(q.poll());
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		solution(n,k);
		System.out.print("<");
		for (int i = 0; i < n; i++) {
			if(i == n-1) {
				System.out.print(answer.get(i)+">");
			}else {
				System.out.print(answer.get(i)+", ");
			}
		}
	}

}
