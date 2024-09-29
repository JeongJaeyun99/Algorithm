package section1;

import java.util.*;

public class 단어_뒤집기 {
	
	public static StringBuilder solution(int n, String arr[]) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			Stack<String> st = new Stack<>();
			for (int j = 0; j < arr[i].length(); j++) {
				st.add(arr[i].charAt(j)+"");
			}
			for (int j = 0; j < arr[i].length(); j++) {
				sb.append(st.pop());
			}
			sb.append("\n");
		}
		return sb;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		System.out.println(solution(n,arr));
	}

}
