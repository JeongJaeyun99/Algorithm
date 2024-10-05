package section_4;

import java.util.*;

public class 아나그램 {
	
	public static String solution(String str1,String str2) {
		String answer = "NO";
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		for (int i = 0; i < str1.length(); i++) {
			map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0) + 1);
		}
		for (int i = 0; i < str2.length(); i++) {
			map2.put(str2.charAt(i), map2.getOrDefault(str2.charAt(i), 0) + 1);
		}
		if(map1.equals(map2)) answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(solution(str1,str2));
	}

}
