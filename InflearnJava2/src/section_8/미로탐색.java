package section_8;

import java.util.*;

public class ¹Ì·ÎÅ½»ö {
	
	static int board[][] = new int[8][8];
	static int directX[] = {-1,1,0,0}; // »óÇÏÁÂ¿ì
	static int directY[] = {0,0,-1,1};
	static int answer = 0; 
			
	public static void DFS(int x,int y) {
		if(x == 7 && y == 7) {
			answer++;
		}else {
			for (int i = 0; i < 4; i++) {
				int nx = x + directX[i]; 
				int ny = y + directY[i];
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					DFS(nx,ny);
					board[nx][ny] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < board.length; i++) {
			for (int j = 1; j < board[i].length; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		board[1][1] = 1;
		DFS(1,1);
		System.out.println(answer);
	}

}
