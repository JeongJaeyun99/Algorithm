package section_6;

import java.util.*;

class SOL implements Comparable<SOL>{
	int x;
	int y;
	public SOL(int x,int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(SOL o) {
		if(this.x == o.x) return this.y - o.y;
		return this.x - o.x;
	}
}

public class ÁÂÇ¥Á¤·Ä {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<SOL> list = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			list.add(new SOL(sc.nextInt(),sc.nextInt()));
		}
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).x + " " + list.get(i).y);
		}
	}

}
