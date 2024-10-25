package section_8;

import java.util.*;

class Point{
	public int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}

public class 미로의_최단거리통과 {
	
	static int [][] board, dis;
	static int directX[] = {-1,1,0,0}; // 상하좌우
	static int directY[] = {0,0,-1,1};
			
	public static void BFS(int x,int y) {
		Queue<Point> q = new LinkedList<>();
		q.offer(new Point(x,y));
		board[x][y] = 1;
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = tmp.x + directX[i];
				int ny = tmp.y + directY[i];
				if(nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
					board[nx][ny] = 1; 
					q.offer(new Point(nx,ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		board = new int[8][8];
		dis = new int[8][8];
		for (int i = 1; i < board.length; i++) {
			for (int j = 1; j < board[i].length; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		BFS(1,1);
		if(dis[7][7] == 0) System.out.println(-1);
		else {
			System.out.println(dis[7][7]);
		}
		
	}

}
