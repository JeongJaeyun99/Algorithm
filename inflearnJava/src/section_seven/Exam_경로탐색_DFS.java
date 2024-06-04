package section_seven;

import java.util.Scanner;

public class Exam_경로탐색_DFS {
	
	static int ch[];
	static int graph[][];
	static int n,m,answer = 0;
	
	public static void DFS(int v) {
		if(v == n) answer++;
		else {
			for (int i = 1; i <= n; i++) {
				if(graph[v][i] == 1 && ch[i] != 1) {
					ch[i] = 1; // 앞으로 나아감
					DFS(i); // 재귀를 하여 밑에서부터 위에까지 올라옴
					ch[i] = 0; // 체크를 풀어줌
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new int[n+1][n+1];
		ch = new int[n+1];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}
		ch[1] = 1; // 시작 노드인 1 체크\
		DFS(1);
		System.out.println(answer);
	}

}
