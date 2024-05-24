package section_five;

import java.util.*;

public class Exam_07 {

	public static String solution(String n, String k) {
		String answer = "NO";
		String temp = "";
		Queue<String> q = new LinkedList<String>();
		for (int i = 0; i < k.length(); i++) {
			q.add(k.charAt(i) + "");
		}
		for (int i = 0; i < n.length(); i++) {
			for (int j = 0; j < q.size(); j++) {
				if(q.peek().equals(n.charAt(i) + "")) {
					temp += q.poll();
					break;
				}else {
					q.poll();
				}
			}
		}
		if(temp.equals(n)) {
			answer = "YES";
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String k = sc.next();
		System.out.print(solution(n, k));
	}

}
