package for_japan;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class fizzbuzz {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력된 숫자의 값과 그 줄의 인덱스를 저장할 변수
        int foundNumber = 0;
        int foundIndex = 0; // 1, 2, 또는 3
        
        // 총 3번의 입력을 받습니다.
        for (int i = 1; i <= 3; i++) {
            String input = br.readLine();
            
            // 입력이 숫자인지 확인합니다.
            try {
                // 숫자로 변환이 성공하면, 그 값을 저장하고 반복문을 종료합니다.
                foundNumber = Integer.parseInt(input);
                foundIndex = i;
                break; // 숫자를 찾았으므로 나머지 입력은 무시해도 됩니다.
            } catch (NumberFormatException e) {
                // 숫자가 아닌 경우 (Fizz, Buzz, FizzBuzz)는 무시하고 다음 줄로 진행
            }
        }
        
        // 2단계: 다음에 출력해야 할 순번(P) 계산
        // (4 - foundIndex)는 현재 숫자로부터 몇 턴 후에 출력해야 하는지를 나타냅니다.
        // 예: 1번째 줄에 숫자가 있으면 (4-1=3) 턴 후
        int nextTurn = 4 - foundIndex;
        int P = foundNumber + nextTurn;
        
        // 3단계: FizzBuzz 규칙 적용 및 출력
        String result = getFizzBuzz(P);
        
        System.out.println(result);
    }
    
    /**
     * 주어진 순번(P)에 대해 FizzBuzz 규칙을 적용하여 문자열을 반환하는 메소드
     */
    public static String getFizzBuzz(int p) {
        // 15의 배수인지 확인
        if (p % 15 == 0) {
            return "FizzBuzz";
        } 
        // 3의 배수인지 확인
        else if (p % 3 == 0) {
            return "Fizz";
        } 
        // 5의 배수인지 확인
        else if (p % 5 == 0) {
            return "Buzz";
        } 
        // 어느 쪽도 아닌 경우, 숫자를 문자열로 반환
        else {
            return String.valueOf(p);
        }
    }
}
