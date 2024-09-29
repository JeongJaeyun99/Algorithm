package section1;

import java.util.*;

public class 문자열_압축 {
	
	public static String solution(String str) {
		String answer = "";
		Queue<String> q = new LinkedList<>();
		for (int i = 0; i < str.length(); i++) {
			q.add(str.charAt(i) + "");
		}
		int size = 1;
		answer += q.poll();
		while(!q.isEmpty()) {
			if((answer.charAt(answer.length()-1) + "").equals(q.peek())) {
				size++;
				q.poll();
			}else {
				if(size == 1) {
					size = 1;
					answer += q.poll();
				}else {
					answer += size;
					size = 1;
					answer += q.poll();
				}
			}
		}
		if(size != 1) answer += size;
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
