package section_six;

import java.util.*;

public class Exam_06 {
	public static String solution(int n, int arr[]) {
		String answer = "";
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(i, arr[i]);
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(map.get(i) != arr[i]) {
				answer += (i+1) + " ";
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(solution(n, arr));
	}
}
