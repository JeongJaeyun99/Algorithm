package section_four;

import java.util.HashMap;
import java.util.Scanner;

public class Exam_02 {
	
	public static String solution(String s1, String s2) {
		String answer = "";
		int temp = 0;
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			map1.put(s1.charAt(i)+"" , map1.getOrDefault(s1.charAt(i)+ "", 0) + 1);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.print(solution(s1, s2));
	}
}
