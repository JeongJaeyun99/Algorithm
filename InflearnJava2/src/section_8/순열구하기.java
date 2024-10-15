package section_8;

import java.util.*;

class sort implements Comparable<sort>{
	int x;
	int y;
	public sort(int x,int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(sort o) {
		if(this.x == o.x) return this.y-o.y;
		return this.x-o.x;
	}
}

public class 순열구하기 {
	
	static int n;
	static int m;
	static int pm[];
	static int arr[];
	static int ch[];
	static ArrayList<sort> list = new ArrayList<sort>();
	
	public static void DFS(int L) {
		if(L == m) {
			for(int x : pm) list.add(new sort(pm[0],pm[1]));
		}else {
			for (int i = 0; i < arr.length; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L+1);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		pm = new int[m];
		ch = new int[n];
		DFS(0);
		Collections.sort(list);
		for(sort a : list) {
			System.out.println(a.x + " " + a.y);
		}
	}

}
