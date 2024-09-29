package code.plus_브루트포스;

import java.io.*;
import java.util.StringTokenizer;

public class 문제_15649_N과M_1 {
	
	static int n;
	static int m;
	static StringBuilder sb = new StringBuilder();
	
	public static void dp(int level,int select) {
		if(level == m) sb.append("")
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s, " ");
		n = Integer.parseInt(st.nextToken()); // 1부터 n 까지의 자연수중
		m = Integer.parseInt(st.nextToken()); // 중복없이 M개를 고른 수열
		if(m == 1) {
			for (int i = 1; i <= n; i++) {
				sb.append(i+"\n");	
			}			
		}else {
			
		}
		System.out.println(sb);
	}

}
