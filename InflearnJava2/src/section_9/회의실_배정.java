package section_9;

import java.util.*;

class sortArr2 implements Comparable<sortArr2>{
	public int startTime,endTime;
	sortArr2(int startTime,int endTime){
		this.startTime = startTime;
		this.endTime = endTime;
	}
	@Override
	public int compareTo(sortArr2 x) {
		if(this.startTime == x.startTime) return this.endTime - x.endTime;
		return this.startTime - x.startTime;
	}
}

public class 회의실_배정 {
	
	public static int solution(int a,ArrayList<sortArr2> arr) {
		int answer = 0;
		Collections.sort(arr);
		for (int i = 0; i < arr.size()-1; i++) {
			
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<sortArr2> arr = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			arr.add(new sortArr2(sc.nextInt(),sc.nextInt()));
		}
		System.out.println(solution(a,arr));
	}

}
