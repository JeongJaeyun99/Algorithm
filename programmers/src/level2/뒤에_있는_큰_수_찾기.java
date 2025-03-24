package level2;

import java.util.*;

class �ڿ�_�ִ�_ū_��_ã��  {
    public int[] solution(int[] numbers) {
    	int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = numbers.length - 1; i >= 0; i--) {
            // ���ÿ��� ���� ������ �۰ų� ���� �� ����
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }
            // ������ ��� ������ -1, �׷��� ������ ������ �� �� ��
            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            // ���� ���� ���ÿ� �߰�
            stack.push(numbers[i]);
        }
        return answer;
    }
}

