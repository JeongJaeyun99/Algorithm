package section_five;

import java.util.*;

public class Exam_03 {

	public static int solution(String s) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int lt = 0;
		int rt = 0;
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i) != '+') && (s.charAt(i) != '-') && (s.charAt(i) != '*') && (s.charAt(i) != '/')) {
				stack.add(Integer.parseInt(s.charAt(i) + ""));
			}else {
				rt = stack.pop();			
				lt = stack.pop();
				switch(s.charAt(i)) {
					case '+':
						stack.push(lt+rt);
						break;
					case '-':
						stack.push(lt-rt);
						break;
					case '*':
						stack.push(lt*rt);
						break;
					case '/':
						stack.push(lt/rt);
						break;
				}
			}
		}
		answer = stack.peek();
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(solution(s));
	}

}
