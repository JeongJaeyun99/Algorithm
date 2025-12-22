package for_japan;

import java.io.*;

public class n_m {
    static boolean[] visited;
    static int[] nums;
    static int n;
    static int m;
    static void backtracking(StringBuilder sb, int depth){
        if(depth == m){
            System.out.println(sb.toString());
            return;
        } 

        for(int i = 1;i < nums.length;i++){
            if (!visited[i]) {
                visited[i] = true;
                int lenBefore = sb.length(); 
                sb.append(nums[i]).append(" ");

                backtracking(sb, depth + 1);

                visited[i] = false;
                sb.setLength(lenBefore); 
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n_m = br.readLine();
        n = Integer.parseInt(n_m.split(" ")[0]);
        m = Integer.parseInt(n_m.split(" ")[1]);
        visited = new boolean[n+1];
        nums = new int[n+1];
        for(int i = 0;i < nums.length;i++) nums[i] = i;
        backtracking(new StringBuilder(), 0);
    }
}
