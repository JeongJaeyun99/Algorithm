package level_2;

import java.util.*;

public class Exam_4949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String str = sc.nextLine();
            
            // 종료 조건
            if (str.equals(".")) {
                break;
            }

            if (isBalanced(str)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // 여는 괄호는 스택에 추가
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } 
            // 닫는 괄호일 경우 짝을 확인
            else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false; // 짝이 맞지 않음
                }
                stack.pop(); // 짝을 맞췄으니 제거
            } 
            else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false; // 짝이 맞지 않음
                }
                stack.pop(); // 짝을 맞췄으니 제거
            }
        }

        // 스택이 비어있으면 모든 괄호가 짝이 맞음
        return stack.isEmpty();
    }
}
