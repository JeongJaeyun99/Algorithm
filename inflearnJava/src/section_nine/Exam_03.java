package section_nine;

import java.util.*;

class timeSort2 implements Comparable<timeSort2> {
	public int time;
	public char state;

	timeSort2(int time, char state) {
		this.time = time;
		this.state = state;
	}

	@Override
	public int compareTo(timeSort2 o) {
		if(this.time == o.time) return this.state - o.state;
		else return this.time - o.time;
	}
}

public class Exam_03 {

	public static int solution(ArrayList<timeSort2> arr, int n) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;
		for (timeSort2 ob : arr) {
			if(ob.state == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
//		for (timeSort2 x : arr) {
//			if (x.end > et) {
//				cnt++;
//				et = x.end;
//			}
//		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<timeSort2> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(new timeSort2(sc.nextInt(),'s'));
			list.add(new timeSort2(sc.nextInt(),'e'));
		}
		System.out.println(solution(list, n));
	}
}
