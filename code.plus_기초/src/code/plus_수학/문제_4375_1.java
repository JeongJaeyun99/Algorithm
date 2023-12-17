package code.plus_수학;

import java.util.Scanner;

public class 문제_4375_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (true) {
			try {
				double n = sc.nextDouble();
				String temp = "1";
				while (true) {
					long one = Long.parseLong(temp);
					if (one % n == 0) {
						sb.append(temp.length() + "\n");
						break;
					} else {
						temp += "1";
					}
				} 
			} catch (Exception e) {
				System.out.println(sb);
				System.exit(0);
			}
		}
	}

}
