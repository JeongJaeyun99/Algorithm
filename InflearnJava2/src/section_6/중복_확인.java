package section_6;

import java.util.*;

public class 중복_확인 {
	
	public static String solution(int a, int arr[]) {
		String answer = "";
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		if(arr.length == set.size()) {
			answer = "U";
		}else {
			answer = "D";
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
