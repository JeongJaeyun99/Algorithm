package level_2;

import java.util.*;

public class Exam_28702 {
	
	public static String solution(String arr[]) {
		String answer = "";
		int temp[] = new int[3];
		for (int i = 0; i < arr.length; i++) {
			int num = 0;
			if(!Character.isAlphabetic(arr[i].charAt(0))) {
				num = Integer.parseInt(arr[i]);
			}
			if(i == (arr.length - 1) && num != 0) {
				if((num+1) % 3 == 0 && (num+1) % 5 == 0) {
					return "FizzBuzz";
				}else if((num+1) % 3 == 0 && (num+1) % 5 != 0) {
					return "Fizz";
				}else if((num+1) % 3 != 0 && (num+1) % 5 == 0) {
					return "Buzz";
				}else {
					return "" + (num+1);
				}
			}else {
				
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		System.out.println(solution(arr));
	}

}
