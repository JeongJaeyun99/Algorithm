package level_2;

import java.util.*;

public class Exam_1546 {
	
	public static double solution(int n,double arr[]) {
		double answer = 0;
		double max = Double.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) max = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (arr[i] / max)*100;
		}
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		answer /= n;
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double arr[] = new double[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		System.out.println(solution(n,arr));
	}

}
