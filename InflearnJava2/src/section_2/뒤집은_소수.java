package section_2;

import java.util.*;

public class 뒤집은_소수 {

	public static StringBuilder solution(int a,String arr[]) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			String temp[] = arr[i].split("");
			String temp2 = "";
			for (int j = temp.length-1; j >= 0; j--) {
				temp2 += temp[j];
			}
			int real = Integer.parseInt(temp2);
			int temp3 = 0;
			if(real == 1) continue;
			for (int j = 2; j < real / 2; j++) {
				if(real % j == 0) {
					temp3++;
					break;
				}
			}
			if(temp3 == 0) sb.append(real + " ");
		}
		return sb;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String arr[] = new String[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
 		}
		System.out.println(solution(a,arr));
	}

}
