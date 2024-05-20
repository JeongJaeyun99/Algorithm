package section_four;

import java.util.HashMap;
import java.util.Scanner;

public class Exam_04 {
	
	public static int solution(String s1, String s2) {
		int answer = 0;
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		int lt = 0;
		for (int i = 0; i < s2.length(); i++) {
			map1.put(s2.charAt(i) + "", map1.getOrDefault(s2.charAt(i) + "", 0) + 1);
		}
		for (int i = 0; i < s2.length()-1; i++) {
			map2.put(s1.charAt(i) + "", map2.getOrDefault(s1.charAt(i) + "", 0) + 1);
		}
		for (int rt = s2.length()-1; rt < s1.length(); rt++) {
			map2.put(s1.charAt(rt) + "", map2.getOrDefault(s1.charAt(rt) + "", 0) + 1);
			if(map2.equals(map1)) {
				answer++;
			}
			map2.put(s1.charAt(lt) + "",map2.get(s1.charAt(lt) + "") - 1);
			if(map2.get(s1.charAt(lt) + "") == 0) {
				map2.remove(s1.charAt(lt) + "");
			}
			lt++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.print(solution(s1,s2));
	}

}
