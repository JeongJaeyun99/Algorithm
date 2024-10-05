package section_4;

import java.util.*;

public class 매출액의_종류 {
	
	public static String solution(int a,int k,String arr[]) {
		String answer = "";
		HashMap<String,Integer> map = new HashMap<>();
		for (int i = 0; i < k; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		answer += map.keySet().size();
		for (int i = k; i < arr.length; i++) {
			map.put(arr[i-k], map.get(arr[i-k]) - 1);
			if(map.get(arr[i-k]) == 0) map.remove(arr[i-k]);
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
			answer += " " + map.keySet().size();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k = sc.nextInt();
		String arr[] = new String[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.next();
		}
		System.out.println(solution(a,k,arr));
	}

}
