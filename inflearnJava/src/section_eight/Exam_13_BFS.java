package section_eight;

import java.util.*;

//class Point{
//	public int x,y;
//	Point(int x,int y){
//		this.x = x;
//		this.y = y;
//	}
//}

public class Exam_13_BFS {

	static int n;
	static int arr[][];
	static int answer;
	static int dx[] = {-1,-1,0,1,1,1,0,-1}; //시계방향
	static int dy[] = {0,1,1,1,0,-1,-1,-1}; //시계방향
	static Queue<Point> q = new LinkedList<>();
	
	public static void BFS(int x, int y,int board[][]) {
		q.offer(new Point(x,y));
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for (int i = 0; i < 8; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					q.offer(new Point(nx,ny));
				}
			}
		}
	}
	
	public static void solution(int board[][]) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j] = 0; // 출발점때문에.
					BFS(i,j,board);
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
