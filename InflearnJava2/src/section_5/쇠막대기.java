package section_5;

import java.util.*;

public class �踷���	 {
	
	public static int solution(String str) {
		int answer = 0;
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') st.push('(');
			else{
				st.pop();
				if(str.charAt(i-1) == '(') answer += st.size();
				else answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
