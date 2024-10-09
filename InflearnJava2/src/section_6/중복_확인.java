package section_6;

import java.util.*;

public class 중복_확인 {
	
	public static String solution(int a, int arr[]) {
		String answer = "";
		int tmp[] = arr.clone();
		Arrays.sort(tmp);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != tmp[i]) answer += (i+1) + " ";
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
