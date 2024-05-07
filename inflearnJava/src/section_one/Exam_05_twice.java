package section_one;

import java.util.Scanner;

public class Exam_05_twice {
	
	public static String solution(String str) {
		String answer = "";
		String arr[] = new String[str.length()];
		int lt = 0;
		int rt = str.length()-1;
		while(true) {
			if(lt > rt) {
				break;
			}
			if(Character.isAlphabetic(str.charAt(lt))) {
				if(Character.isAlphabetic(str.charAt(rt))) {
					arr[lt] = str.charAt(rt) + "";
					arr[rt] = str.charAt(lt) + "";
					rt--;
					lt++;
				}else {
					arr[rt] = str.charAt(rt) + "";
					rt--;
				}
			}
			else {
				arr[lt] = str.charAt(lt) + "";
				lt++;	
			}
		}
		for (int j = 0; j < arr.length; j++) {
			answer += arr[j];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
