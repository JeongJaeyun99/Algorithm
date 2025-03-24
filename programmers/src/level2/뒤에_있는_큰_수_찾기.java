package level2;

import java.util.*;

class 뒤에_있는_큰_수_찾기  {
    public int[] solution(int[] numbers) {
    	int[] answer = new int[numbers.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = numbers.length - 1; i >= 0; i--) {
            // 스택에서 현재 값보다 작거나 같은 값 제거
            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
                stack.pop();
            }
            // 스택이 비어 있으면 -1, 그렇지 않으면 스택의 맨 위 값
            answer[i] = stack.isEmpty() ? -1 : stack.peek();
            // 현재 값을 스택에 추가
            stack.push(numbers[i]);
        }
        return answer;
    }
}

