package section_nine;

import java.util.*;

class Body implements Comparable<Body> {
	public int h, w;

	Body(int h, int w) {
		this.h = h;
		this.w = w;
	}

	@Override
	public int compareTo(Body o) {
		return o.h - this.h; // 내림차순 >> 오름차순은 this.~ - o.~
	}
}

public class Exam_01 {

//	public static int solution(int arr[][]) {
//		int answer = 0;
//		for (int i = 0; i < arr.length; i++) {
//			int height = arr[i][0];
//			int weight = arr[i][1];
//			int check = 0;
//			for (int j = 0; j < arr.length; j++) {
//				if(j != i) {
//					if(height < arr[j][0] && weight < arr[j][1]) break;
//					else {
//						check++;
//					}
//				}
//			}
//			if(check == arr.length-1) answer++;
//		}
//		return answer;
//	}
	public static int solution(ArrayList<Body> arr, int n) {
		int cnt = 0;
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for (Body o : arr) {
			if (o.w > max) {
				max = o.w;
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			arr.add(new Body(h, w));
		}
		int answer = solution(arr, n);
		System.out.println(answer);
	}

}
