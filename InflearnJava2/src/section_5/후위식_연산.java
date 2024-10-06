package section_5;

import java.util.*;

public class 후위식_연산 {
	
	public static int solution(String str) {
		int answer = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
				int rt = st.pop();
				int lt = st.pop();
				if(str.charAt(i) == '+') st.push(lt+rt);
				else if(str.charAt(i) == '-') st.push(lt-rt);
				else if(str.charAt(i) == '*') st.push(lt*rt);
				else if(str.charAt(i) == '/') st.push(lt/rt);
			}else {
				st.push(Integer.parseInt(str.charAt(i) + ""));
			}
			answer = st.peek();
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
