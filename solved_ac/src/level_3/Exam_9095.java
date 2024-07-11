package level_3;

import java.io.*;

public class Exam_9095 {
	
	static int[] arr;
	static int[] test;
	
	public static void solution() {
		StringBuilder sb = new StringBuilder();
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for (int i = 4; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
		}
		for (int i = 0; i < test.length; i++) {
			sb.append(arr[test[i]]).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		test = new int[T];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < test.length; i++) {
			test[i] = Integer.parseInt(br.readLine());
			if(test[i] > max) max = test[i];
		}
		arr = new int[max+1];
		solution();
	}

}
