package greedy;

import java.io.*;
import java.util.*;

public class Exam_20115 {

	public static double solution(int arr[]) {
		double answer = 0;
		Arrays.sort(arr);
		answer = arr[arr.length - 1] + (arr[arr.length - 2] / 2d);
		for (int i = arr.length - 3; i >= 0; i--) {
			answer += (arr[i] / 2d);
		}
		return answer;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String arr[] = br.readLine().split(" ");
		int arr2[] = new int[arr.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		System.out.println(solution(arr2));
	}

}
