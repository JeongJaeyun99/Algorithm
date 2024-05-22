package section_five;

import java.util.*;

public class Exam_02 {

	public static int solution(int n,int game[][],int m,int moves[]) {
		int answer = 0;
		Stack<Integer> stack = new Stack<Integer>(); // 바구니역할
		for (int i = 0; i < moves.length; i++) {
			moves[i]--;
			for (int j = 0; j < game.length; j++) {
				if(game[j][moves[i]] != 0) {
					stack.add(game[j][moves[i]]);
					game[j][moves[i]] = 0;
					break;
				}
			}
			if(i >= 1 && stack.peek() == stack.get(stack.size()-2)) {
				stack.pop();
				stack.pop();
				answer+=2;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int game[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				game[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int moves[] = new int[m];
		for (int i = 0; i < moves.length; i++) {
			moves[i] = sc.nextInt();
		}
		System.out.print(solution(n,game,m,moves));
	}

}
