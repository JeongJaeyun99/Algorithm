package section_8;

import java.util.*;

class Tomato_point{
	public int x,y;
	Tomato_point(int x,int y){
		this.x = x;
		this.y = y;
	}
}

public class 토마토 {
	
	static int [][] board,dis;
	static int directX[] = {-1,1,0,0}; // 상하좌우
	static int directY[] = {0,0,-1,1};
	static int n,m;
	static Scanner sc = new Scanner(System.in);
	static int answer = 0;
			
	public static void BFS() {
		Queue<Tomato_point> q = new LinkedList<>();
		for (int i = 1; i < board.length; i++) {
			for (int j = 1; j < board[i].length; j++) {
				board[i][j] = sc.nextInt();
				if(board[i][j] == 1) {
					q.offer(new Tomato_point(i,j));
				}
			}
		}
		while(!q.isEmpty()) {
			System.out.println(q.size());
			Tomato_point tmp = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = tmp.x + directX[i];
				int ny = tmp.y + directY[i];
				if(nx >= 1 && nx <= n && ny >= 1 && ny <= m && board[tmp.x][tmp.y] == 1 && board[nx][ny] == 0) {
					board[nx][ny] = 1; 
					q.offer(new Tomato_point(nx,ny));
					System.out.println(tmp.x + " " + tmp.y);
				} // 코드 완성시키기
			}
		}
	}
	
	public static void main(String[] args) {
		n = sc.nextInt();
		m = sc.nextInt();
		board = new int[m+1][n+1];
		BFS();
		System.out.println(answer);
	}

}
