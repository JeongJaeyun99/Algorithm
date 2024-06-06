package section_seven;

import java.util.*;

public class 이진트리_인접리스트 {
	static int ch[];
	static int n,m,answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	public void DFS(int v) { // root는 100번지 즉, 루트노드
		if(v == n) answer++;
		else {
			for (int nv : graph.get(v)) {
				if(ch[nv] != 1) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	public static void main(String[] args) {
		이진트리_인접리스트 tree = new 이진트리_인접리스트();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		ch = new int[n+1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		ch[1] = 1;
		tree.DFS(1);
		System.out.println(answer);
	}

}
