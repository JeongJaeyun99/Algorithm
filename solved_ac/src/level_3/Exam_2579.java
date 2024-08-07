package level_3;

import java.io.*;

public class Exam_2579 {
	static int stair[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		stair = new int[n+1];
		for (int i=1; i<=n; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		
		//dp : 각 단계별 최댓값
		int[] dp = new int[n+1];
		
		dp[1] = stair[1];
		if (n>=2) {
			dp[2] = stair[1] + stair[2];
		}
		
		//dp[i-1]과 비교를 하면 중간에 2개 이상 비어있는 단계가 발생할 수 있다.
		//마지막 1칸전에는 2칸연속이 올 수 없다.
		
		for (int i=3; i<=n; i++) {
			dp[i] = Math.max(dp[i-3] + stair[i-1] + stair[i], dp[i-2] + stair[i]);
		}
		System.out.println(dp[n]);
	}

}
