package for_japan;

import java.io.*;
import java.util.*;

public class dfs_bfs {
    static boolean visited1[];
    static boolean visited2[];
    static StringBuilder sb = new StringBuilder();
    static void dfs(int node,int graph[][],int n){
        visited1[node] = true;
        sb.append(node).append(" ");
        for(int i = 0;i <= n;i++){
            if(graph[node][i] == 1 && !visited1[i]){
                dfs(i,graph,n);
            }
        }
    }

    static void bfs(int start, int graph[][], int n) {
        Queue<Integer> queue = new LinkedList<>();
    
        queue.add(start);
        visited2[start] = true; // 시작 노드 방문 처리

        while (!queue.isEmpty()) {
            int node = queue.poll(); // 큐에서 하나를 꺼냄
            sb.append(node).append(" "); // 꺼낼 때 출력!

            for (int i = 1; i <= n; i++) {
                // 연결되어 있고 + 아직 방문하지 않았다면
                if (graph[node][i] == 1 && !visited2[i]) {
                    visited2[i] = true; // 방문 도장 찍고
                    queue.add(i);       // 큐에 줄 세우기
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer n_m_start = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(n_m_start.nextToken());
        int m = Integer.parseInt(n_m_start.nextToken());
        int start = Integer.parseInt(n_m_start.nextToken());
        int graph[][] = new int[n+1][n+1];
        visited1 = new boolean[n+1];
        for(int i = 0;i < m;i++){
            StringTokenizer a_to_b = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(a_to_b.nextToken());
            int v = Integer.parseInt(a_to_b.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        dfs(start, graph, n);
        visited2 = new boolean[n+1];
        sb.append("\n");
        bfs(start, graph, n);
        System.out.println(sb);
    }
}
