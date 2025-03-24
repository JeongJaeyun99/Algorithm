package level_2;

import java.util.*;

public class Exam_4949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String str = sc.nextLine();
            
            // ���� ����
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
            // ���� ��ȣ�� ���ÿ� �߰�
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } 
            // �ݴ� ��ȣ�� ��� ¦�� Ȯ��
            else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false; // ¦�� ���� ����
                }
                stack.pop(); // ¦�� �������� ����
            } 
            else if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return false; // ¦�� ���� ����
                }
                stack.pop(); // ¦�� �������� ����
            }
        }

        // ������ ��������� ��� ��ȣ�� ¦�� ����
        return stack.isEmpty();
    }
}
