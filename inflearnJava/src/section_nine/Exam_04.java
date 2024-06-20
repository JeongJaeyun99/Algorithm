package section_nine;

import java.util.*;

class lecture implements Comparable<lecture>{
	int money,time;
	lecture(int money,int time){
		this.money = money;
		this.time = time;
	}
	
	@Override
	public int compareTo(lecture o) {
		return o.time - this.time;
	}
}

public class Exam_04 {
	
	public static int solution(ArrayList<lecture> list,int n) {
		int answer = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		Collections.sort(list);
		int maxDays = list.get(0).time;
		int index = 0;
		int j = 0;
		for (int i = maxDays; i >= 1; i--) {
			for ( ; j < n; j++) {
				if(list.get(j).time < i) break;
				pq.offer(list.get(j).money);
			}
			System.out.println(pq);
			if(!pq.isEmpty()) answer += pq.poll();
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<lecture> list = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			list.add(new lecture(sc.nextInt(),sc.nextInt()));
		}
		System.out.println(solution(list,n));
	}
}
