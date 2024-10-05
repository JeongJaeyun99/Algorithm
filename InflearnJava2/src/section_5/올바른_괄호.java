package section_5;

import java.util.*;

public class 올바른_괄호 {
	public static String solution(String str) {
		String answer = "NO";
		Stack<Character> st = new Stack<>();
		st.push(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == ')') {
				if(st.isEmpty()) {
					return "NO";
				}else {
					st.pop();
				}
			}else {
				st.push(str.charAt(i));
			}
		}
		if(st.isEmpty()) answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
