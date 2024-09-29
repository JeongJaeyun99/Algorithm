package section1;

import java.util.*;

public class ¾ÏÈ£ {

	public static String solution(int a,String str) {
		String answer = "";
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < str.length(); i+=7) {
			arr.add(str.substring(i,i+7));
		}
		for (int i = 0; i < arr.size(); i++) {
			String temp = "";
			for (int j = 0; j < arr.get(i).length(); j++) {
				if((arr.get(i).charAt(j) + "").equals("#")) temp += 1;
				else if((arr.get(i).charAt(j) + "").equals("*")) temp += 0;
			}
			int asc = 0;
			int pw = 0;
			for (int j = temp.length()-1; j >= 0; j--) {
				if(Integer.parseInt(temp.charAt(j) + "") != 0) {
					int a1 = 2 * Integer.parseInt(temp.charAt(j) + "");
					asc += Math.pow(a1, pw);
				}
				pw++;
			}
			answer += (char)asc;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String str = sc.next();
		System.out.println(solution(a,str));
	}

}
