package section_7;

import java.util.*;

public class 송아지_찾기 {
	
	static int ch[]; // 사용했는지 안했는지 check
	static int dis[] = {1,-1,5};
	static Queue<Integer> q = new LinkedList<>();
	static int s;
	static int e;
	
	public static int BFS() {
		ch = new int[10001];
		ch[s] = 1;
		q.offer(s);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i = 0;i < len;i++) {
				int x = q.poll();
				for (int j = 0; j < 3; j++) {
					int nx = x + dis[j];
					if(nx == e) return L+1;
					if(nx > 0 && nx <= 10000 && ch[nx] == 0) {
						ch[nx] = 1;
						q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		e = sc.nextInt();
		System.out.println(BFS());
	}

}
