package code.plus_���Ʈ����;

import java.io.*;
import java.util.StringTokenizer;

public class ����_15649_N��M_1 {
	
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
		n = Integer.parseInt(st.nextToken()); // 1���� n ������ �ڿ�����
		m = Integer.parseInt(st.nextToken()); // �ߺ����� M���� �� ����
		if(m == 1) {
			for (int i = 1; i <= n; i++) {
				sb.append(i+"\n");	
			}			
		}else {
			
		}
		System.out.println(sb);
	}

}
