package section_5;

import java.util.*;

public class 교육과정_설계 {
//	public static String solution(String ShouldSubject,String subject) {
//		String answer = "NO";
//		String temp = "";
//		for (int i = 0; i < subject.length(); i++) {
//			if(ShouldSubject.contains(subject.charAt(i) + "")) {
//				temp += subject.charAt(i);
//			}
//		}
//		if(ShouldSubject.equals(temp)) answer = "YES";
//		return answer;
//	}
	
	public static String solution(String ShouldSubject,String subject) {
		String answer = "NO";
		Queue<String> q = new LinkedList<>(); 
		for (int i = 0; i < ShouldSubject.length(); i++) q.offer(ShouldSubject.charAt(i) + "");
		for (int i = 0; i < subject.length(); i++) {
			if(q.contains(subject.charAt(i) + "")) q.poll();
		}
		if(q.isEmpty()) answer = "YES";
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ShouldSubject = sc.next();
		String subject = sc.next();
		System.out.println(solution(ShouldSubject,subject));
	}

}
