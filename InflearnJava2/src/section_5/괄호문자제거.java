package section_5;

import java.util.*;

public class 괄호문자제거 {
	public static String solution(String str) {
		String answer = "";
		Stack<Character> st = new Stack<>();
		st.push(str.charAt(0));
		if(str.charAt(0) != '(') answer += str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == ')') {
				while(true) {
					if(st.peek() == '(') {
						st.pop();
						break;
					}
					st.pop();
				}
			}else {
				st.push(str.charAt(i));
			}
		}
		for (int i = 0; i < st.size(); i++) {
			answer += st.get(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
