package greedy;

import java.util.*;

public class Exam_11508 {

	static ArrayList<Integer> list = new ArrayList<>();
	static int answer = 0;
	
	public static void solution() {
		for (int i = 0; i < list.size(); i++) {
			if(i % 3 != 2) answer += list.get(i); 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list,Collections.reverseOrder());
		solution();
		System.out.println(answer);
	}

}
