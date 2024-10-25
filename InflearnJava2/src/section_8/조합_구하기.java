package section_8;

import java.util.*;

public class 조합_구하기 {

	static int n;
	static int m;
	static int combi[];
	
	public static void DFS(int L,int s) {
		if(L == m) {
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		}else {
			for (int i = s; i <= n; i++) {
				combi[L] = i;
				DFS(L+1,i+1);
			}
			// 여기서 DFS(0,4) 의 결과가 4,4이고 출력되지 않는 이유!
			// 우선 combi[0]은 4가 정상적으로 들어간다.
			// 하지만 combi[1]는 L이 2에 닿을수 없으므로(s가 5가 되면 for문으로 못들어감) 값이 이전값인 4이다.
			// 그리고 출력되지않는 이유도 마찬가지로 L이 2에 닿을수 없으므로!!
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		combi = new int[m];
		DFS(0,1);
	}

}
