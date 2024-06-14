package section_eight;

import java.util.*;

public class Exam_13_DFS {

	static int n;
	static int arr[][];
	static int answer;
	static int dx[] = {-1,-1,0,1,1,1,0,-1}; //시계방향
	static int dy[] = {0,1,1,1,0,-1,-1,-1}; //시계방향
	
	
	public static void DFS(int x, int y,int board[][]) {
		for(int i = 0;i < 8;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
				board[nx][ny] = 0;
				DFS(nx,ny,board);
			}
		}
	}
	
	public static void solution(int board[][]) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j] = 0; // 출발점때문에.
					DFS(i,j,board);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		solution(arr);
		System.out.println(answer);
	}

}
