package for_japan;

import java.io.*;
import java.util.*;

public class connect_factor {
    static boolean visited[];
    static void dfs(int node,int graph[][],int n){
        visited[node] = true;
        for(int i = 1;i <= n;i++){
            if(graph[node][i] == 1 && !visited[i]){
                dfs(i,graph,n);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer n_m_start = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(n_m_start.nextToken());
        int m = Integer.parseInt(n_m_start.nextToken());
        int graph[][] = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i = 0;i < m;i++){
            StringTokenizer a_to_b = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(a_to_b.nextToken());
            int v = Integer.parseInt(a_to_b.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        int ans = 0;
        for(int i = 1;i <= n;i++){
            if(!visited[i]){
                dfs(i, graph, n);
                ans++;
            }
        }
        System.out.println(ans);
    }
}
