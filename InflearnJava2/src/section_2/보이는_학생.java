package section_2;

import java.util.*;

public class 보이는_학생 {
	
	public static int solution(int a, int arr[]) {
		int answer = 1;
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				 answer++;
				 max = arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(a,arr));
	}

}
