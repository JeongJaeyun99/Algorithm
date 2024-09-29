package section1;

import java.util.Scanner;

public class 가장_짧은_문자거리 {

	public static int[] solution(String str,String c) {
		int a = 1000;
		int arr1[] = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			if((str.charAt(i)+"").equals(c)) {
				a = 0;
				arr1[i] = a;
			}else {
				a++;
				arr1[i] = a;
			}
		}
		a = 1000;
		for (int i = str.length()-1; i >= 0; i--) {
			if((str.charAt(i)+"").equals(c)) {
				a = 0;
			}else {
				a++;
				arr1[i] = Math.min(arr1[i], a);
			}
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String c = sc.next();
		for (int i = 0; i < solution(str,c).length; i++) {
			if(i == solution(str,c).length-1) System.out.print(solution(str,c)[i]);
			else {
				System.out.print(solution(str,c)[i] + " ");
			}
		}
	}

}
