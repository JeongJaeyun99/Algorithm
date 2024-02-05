package section_one;

import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		char str1Arr[] = new char[str1.length()];
		int cnt = 0;
		for (int i = 0; i < str1.length(); i++) {
			if(Character.isUpperCase(str1.charAt(i))) {
				str1Arr[i] = Character.toLowerCase(str1.charAt(i));
			}else {
				str1Arr[i] = str1.charAt(i);
			}
		}
		for (int i = 0; i < str1Arr.length; i++) {
			if(str1Arr[i] == Character.toLowerCase(str2.charAt(0))) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
