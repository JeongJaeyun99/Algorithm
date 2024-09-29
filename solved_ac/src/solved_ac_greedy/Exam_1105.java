package solved_ac_greedy;

import java.util.Scanner;

public class Exam_1105 {
	
	public static int solve(int l,int r) {
		if(!(l+"").contains("8") || !(r+"").contains("8")) return 0;
		int lNum = 0;
		int rNum = 0;
		String lArr[] = (l+"").split("");
		String rArr[] = (r+"").split("");
		for (int i = 0; i < lArr.length; i++) {
			if(lArr[i].equals("8")) lNum++;
		}
		for (int i = 0; i < rArr.length; i++) {
			if(rArr[i].equals("8")) rNum++;
		}
		int start = Math.min(lNum, rNum);
		for (int i = l+1; i < r; i++) {
			String temp = i+"";
			int tempNum = 0;
			for (int j = 0; j < temp.length(); j++) {
				if(temp.charAt(j) == '8') tempNum++;
			}
			if(start == 0) return 0;
			else if(start > tempNum) start = tempNum;
		}
		return start;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(solve(l,r));
	}

}
