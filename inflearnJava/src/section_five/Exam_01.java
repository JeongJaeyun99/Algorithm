package section_five;

import java.util.*;

public class Exam_01 {

	public static String solution(String s) {
		String answer = "YES";
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i) + "").equals("(")) {
				stack.push(s.charAt(i) + "");
			}else {
				if(stack.isEmpty()) {
					return "NO";
				}else {
					stack.pop();
				}
			}
		}
		if(!stack.isEmpty()) {
			return "NO";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(solution(s));
	}

}
