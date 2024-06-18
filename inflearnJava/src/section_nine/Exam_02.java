package section_nine;

import java.util.*;

class timeSort implements Comparable<timeSort>{
	public int start,end;
	timeSort(int start,int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public int compareTo(timeSort o) {
		if(this.end == o.end) return this.start - o.start;
		else return this.end - o.end;
	}
}

public class Exam_02 {
	
	public static int solution(ArrayList<timeSort> arr,int n) {
		int answer = 0;
		
		int endTime = 0;
		for(timeSort ob : arr) {
			if(ob.start >= endTime) {
				answer++;
				endTime = ob.end;
			}
		}
//		for (int i = 0; i < n; i++) {
//			int start_end = arr.get(i).end;
//			int cnt = 1;
//			for (int j = 0; j < n; j++) {
//				if(i != j) {
//					if(start_end <= arr.get(j).start) {
//						cnt++;
//						start_end = arr.get(j).end;
//					}
//				}
//			}
//			answer = Math.max(answer, cnt);
//		} // 시간초과
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<timeSort> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			arr.add(new timeSort(sc.nextInt(),sc.nextInt()));
		}
		Collections.sort(arr);
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).start + " " + arr.get(i).end);
		}
		System.out.println(solution(arr,n));
	}

}
