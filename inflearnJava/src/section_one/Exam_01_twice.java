package section_one;

import java.util.Scanner;

public class Exam_01_twice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int num = 0;
		char arr[] = new char[str1.length()];
		for (int i = 0; i < str1.length(); i++) {
			if(Character.isUpperCase(str1.charAt(i))){
				arr[i] = Character.toLowerCase(str1.charAt(i));
			}else {
				arr[i] = str1.charAt(i);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == Character.toLowerCase(str2.charAt(0))) {
				num++;
			}
		}
		System.out.println(num);
	}
}	
