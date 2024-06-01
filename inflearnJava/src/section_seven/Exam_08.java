package section_seven;

import java.util.*;

public class Exam_08 {
	static int dis[] = {1,-1,5};
	static int ch[];
	static Queue<Integer> q = new LinkedList<Integer>();
	public static int solution(int s,int n) {
		ch = new int[10001];
		ch[s] = 1; // 출발지점
		q.offer(s);
		int level = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for (int i = 0; i < len; i++) {
				int x = q.poll();
				for(int j = 0;j < 3;j++) {
					int nx = x + dis[j];
					if(nx == n) return level+1;
					if(nx >= 1 && nx <= 10000 && ch[nx] == 0) {
						// ch[nx] == 0 >> 아직 방문 x
						ch[nx] = 1;
						q.offer(nx);
					}
				}
			}
			level++;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(solution(s,n));
	}

}
