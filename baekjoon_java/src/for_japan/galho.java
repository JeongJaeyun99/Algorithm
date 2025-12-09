package for_japan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class galho {

    public static void main(String[] args) throws IOException {
        // 빠른 입력을 위한 BufferedReader 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        // 입력의 종료 조건: "." (마침표 하나)를 입력받을 때까지 반복
        while (true) {
            String s = br.readLine();
            
            // 종료 조건 체크
            if (s.equals(".")) {
                break;
            }
            
            // 괄호 균형 검사 메소드 호출 및 결과 저장
            sb.append(solve(s)).append('\n');
        }
        
        System.out.println(sb);
    }
    
    /**
     * 문자열의 괄호 균형을 검사하는 메소드
     */
    public static String solve(String s) {
        // 괄호를 담을 Stack 초기화
        Stack<Character> stack = new Stack<>();
        
        // 문자열을 순회
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            // 1. 여는 괄호인 경우 (Push)
            if (c == '(' || c == '[') {
                stack.push(c);
            }
            
            // 2. 닫는 괄호인 경우 (Pop 및 검사)
            else if (c == ')') {
                // 스택이 비어있거나, 짝이 맞지 않는 경우 (Stack top이 '('가 아닌 경우)
                if (stack.isEmpty() || stack.peek() != '(') {
                    return "no";
                }
                // 짝이 맞는 경우 pop
                stack.pop();
            }
            
            else if (c == ']') {
                // 스택이 비어있거나, 짝이 맞지 않는 경우 (Stack top이 '['가 아닌 경우)
                if (stack.isEmpty() || stack.peek() != '[') {
                    return "no";
                }
                // 짝이 맞는 경우 pop
                stack.pop();
            }
            // 그 외의 문자(알파벳, 공백, 마침표 등)는 무시하고 다음 반복으로 넘어감
        }
        
        // 3. 문자열 끝까지 검사한 후 최종 판별
        // 스택이 비어있다면 균형 잡힌 상태
        if (stack.isEmpty()) {
            return "yes";
        } 
        // 스택에 괄호가 남아있다면 (여는 괄호가 닫히지 않은 경우) 균형이 깨진 상태
        else {
            return "no";
        }
    }
}