package section_eight;

import java.util.*;

//class Point{
//	public int x,y;
//	Point(int x,int y){
//		this.x = x;
//		this.y = y;
//	}
//}

public class Exam_12 {
	
	static int n,m;
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1};
	static int arr[][],day[][];
	static Queue<Point> q = new LinkedList<>();
	
	public static void BFS() {
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for (int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && arr[nx][ny] == 0) {
					arr[nx][ny] = 1;
					q.offer(new Point(nx,ny));
					day[nx][ny] = day[tmp.x][tmp.y]+1;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		arr = new int[n][m];
		day = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] == 1) q.offer(new Point(i,j));
			}
		}
		BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(arr[i][j] == 0) flag = false;
			}
		}
		if(flag) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					answer = Math.max(answer,day[i][j]);
				}
			}
			System.out.println(answer);
		}else {
			System.out.println(-1);
		}
	}
}
