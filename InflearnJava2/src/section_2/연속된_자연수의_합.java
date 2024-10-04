package section_2;

import java.util.Scanner;

public class 연속된_자연수의_합 {

	public static int solution(int n) {
		int answer = 0;
		int index = 1;
		int startIndex = 1;
		int sum = 0;
		while(index < n) {
			if(sum < n) {
				sum += index;
				index++;
			}else if(sum > n) {
				sum -= startIndex;
				startIndex++;
			}else if(sum == n) {
				answer++;
				sum -= startIndex;
				startIndex++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

}
