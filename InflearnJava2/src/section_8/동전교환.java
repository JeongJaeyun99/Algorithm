package section_8;

import java.util.*;

public class 동전교환 {

	static int n;
	static int m;
	static int ch[];
	static Queue<Integer> q = new LinkedList<>();
	static int answer;

	public static void BFS(int L,int arr[]) {
		q.offer(0);
		while (!q.isEmpty()) {
			L++;
			int len = q.size();
			for (int i = 0; i < len; i++) {
				int x = q.poll();
				for (int j = 0; j < arr.length; j++) {
					int nx = x + arr[j];
					if(nx == m) {
						answer = L;
						return;
					}
					if(ch[nx] == 0) {
						q.offer(nx);
						ch[nx] = 1;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		m = sc.nextInt();
		ch = new int[10000];
		BFS(0, arr);
		System.out.println(answer);
	}

}
