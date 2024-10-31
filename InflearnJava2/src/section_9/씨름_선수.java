package section_9;

import java.util.*;

class sortArr implements Comparable<sortArr>{
	public int t,w;
	sortArr(int t,int w){
		this.t = t;
		this.w = w;
	}
	@Override
	public int compareTo(sortArr x) {
		if(this.t == x.t) return this.w - x.w;
		return this.t - x.t;
	}
}

public class 씨름_선수 {
	
	public static int solution(int a,ArrayList<sortArr> arr) {
		int fakeAnswer = 0;
		Collections.sort(arr);
		for (int i = 0; i < arr.size()-1; i++) {
			for (int j = i+1; j < arr.size(); j++) {
				if(arr.get(i).w < arr.get(j).w) { // 키는 이미 정렬되어 있으므로
					fakeAnswer++;
					break;
				}
			}
		}
		return a - fakeAnswer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		ArrayList<sortArr> arr = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			arr.add(new sortArr(sc.nextInt(),sc.nextInt()));
		}
		System.out.println(solution(a,arr));
	}

}
