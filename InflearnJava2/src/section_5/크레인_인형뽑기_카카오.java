package section_5;

import java.util.*;

public class 크레인_인형뽑기_카카오 {
	
	public static int solution(int n,int m,int board[][],int moves[]) {
		int answer = 0;
		Stack<Integer> baguni = new Stack<>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(!baguni.isEmpty() && board[j][moves[i]-1] == baguni.peek()) {
					answer+=2;
					board[j][moves[i]-1] = 0;
					baguni.pop();
					break;
				}
				if(board[j][moves[i]-1] != 0) {
					baguni.push(board[j][moves[i]-1]);
					board[j][moves[i]-1] = 0;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int board[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		int m = sc.nextInt();
		int moves[] = new int[m];
		for (int i = 0; i < moves.length; i++) {
			moves[i] = sc.nextInt();
		}
		System.out.println(solution(n,m,board,moves));
	}

}
