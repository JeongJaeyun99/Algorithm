package section_four;

import java.util.*;

public class Exam_05 {
	
	public static int solution(int n,int k, int arr[]) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(solution(n,k,arr));
	}

}
