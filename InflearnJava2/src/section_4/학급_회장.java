package section_4;

import java.util.*;

public class 학급_회장 {
	
	public static String solution(int a,String str) {
		String answer = "";
		HashMap<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		int max = Integer.MIN_VALUE;
		for (char x : map.keySet()) {
			if(map.get(x) > max) {
				max = map.get(x);
				answer = x + "";
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String str = sc.next();
		System.out.println(solution(a,str));
	}

}
