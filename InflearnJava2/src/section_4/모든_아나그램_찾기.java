package section_4;

import java.util.*;

public class 모든_아나그램_찾기 {
	
	public static int solution(String str,String ana) {
		int answer = 0;
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		for (int i = 0; i < ana.length(); i++) {
			map1.put(ana.charAt(i), map1.getOrDefault(ana.charAt(i) , 0) + 1);
			map2.put(str.charAt(i), map2.getOrDefault(str.charAt(i) , 0) + 1);
		}
		if(map1.equals(map2)) answer++;
		for (int i = ana.length(); i < str.length(); i++) {
			map2.put(str.charAt(i-ana.length()), map2.get(str.charAt(i-ana.length()))-1);
			if(map2.get(str.charAt(i-ana.length())) == 0) map2.remove(str.charAt(i-ana.length()));
			map2.put(str.charAt(i), map2.getOrDefault(str.charAt(i) , 0) + 1);
			if(map1.equals(map2)) answer++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ana = sc.next();
		System.out.println(solution(str,ana));
	}

}
