package level2;

import java.util.*;

class Point{
	public int x,y;
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
}

class Solution {
    
    static int [][] dis;
	static int directX[] = {-1,1,0,0}; // 상하좌우
	static int directY[] = {0,0,-1,1};
    
    public void BFS(int x,int y,int[][] maps){
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(x,y));
        maps[x][y] = 0; // 지나간곳은 0으로 바꾸고, 지나가지 않은곳1, 지나갈수 없는곳은 0
        dis[x][y] = 1;
        while(!q.isEmpty()){
            Point tmp = q.poll();
            for(int i = 0;i < 4;i++){
                int nx = tmp.x + directX[i];
                int ny = tmp.y + directY[i];
                if(nx >= 0 && nx <= maps.length-1 && ny >= 0 && ny <= maps[0].length-1 && maps[nx][ny] == 1){
                    maps[nx][ny] = 0;
                    q.offer(new Point(nx,ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }
    
    public int solution(int[][] maps) {
		dis = new int[maps.length][maps[0].length];
        BFS(0,0,maps);
        if(dis[maps.length-1][maps[0].length-1]== 0){
            return -1;
        }else{
            return(dis[maps.length-1][maps[0].length-1]);
        }
    }
}
