package section_one;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_11 {
	
	public static String solution(String str) {
		String answer = "";
		String temp[] = str.split("");
		ArrayList<String> arr = new ArrayList<String>();
		for (int i = 0; i < temp.length; i++) {
			arr.add(temp[i]);
		}
		arr.add("");
		int cnt = 1;
		for (int i = 0; i < arr.size()-1; i++) {
			if(arr.get(i).equals(arr.get(i+1))) {
				cnt++;
			}else {
				if(cnt > 1) {
					answer += arr.get(i) + cnt;
				}else {
					answer += arr.get(i);
				}
				cnt = 1;					
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}

}
