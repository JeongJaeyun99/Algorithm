package section_seven;

import java.util.*;

public class 이진트리_최단거리 {
	static int n,m;
	static int ch[],dis[];
	static ArrayList<ArrayList<Integer>> graph;
	public static void BFS(int v) { // root는 100번지 즉, 루트노드
		Queue<Integer> q = new LinkedList();
		ch[v] = 1;
		dis[v] = 0;
		q.offer(v);
		while(!q.isEmpty()) {
			int cv = q.poll();
			for (int nv : graph.get(cv)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					q.offer(nv);
					dis[nv] = dis[cv] + 1;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		dis = new int[n+1];
		ch = new int[n+1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		BFS(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(i + " : " + dis[i]);
		}
	}

}
