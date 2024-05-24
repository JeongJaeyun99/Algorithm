package section_five;

import java.util.*;

public class Exam_05 {

	public static int solution(String s) {
		int answer = 0;
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i) + "").equals(")")) {
				if((s.charAt(i-1) + "").equals("(")) {
					stack.pop();
					answer += stack.size();
				}else {
					stack.pop();
					answer++;
				}
			}else {
				stack.add(s.charAt(i) + "");
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(solution(s));
	}

}