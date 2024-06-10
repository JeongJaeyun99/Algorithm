package section_eight;

import java.util.*;

public class Exam_05 {

	static int n, m = 0;
	static int answer = Integer.MAX_VALUE;
	
	public static void DFS(int L,int hap,Integer coin[]) {
		if(hap > m) return;
		if(L >= answer) return;
		if(hap == m) {
			answer = Math.min(answer , L);
		}else {
			for (int i = 0; i < n; i++) {
				DFS(L+1,hap+coin[i],coin);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		Integer coin[] = new Integer[n];
		for (int i = 0; i < coin.length; i++) {
			coin[i] = sc.nextInt();
		}
		Arrays.sort(coin,Collections.reverseOrder());
		m = sc.nextInt();
		DFS(0,0,coin);
		System.out.println(answer);
	}

}
