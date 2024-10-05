package section_3;

import java.util.*;

public class 공통원소_구하기 {

	public static StringBuilder solution(int a,int b,ArrayList<Integer> arr) {
		StringBuilder sb = new StringBuilder();
		Collections.sort(arr);
		Queue<Integer> q = new LinkedList<Integer>(); 
		for (int i = 0; i < arr.size(); i++) {
			if(q.contains(arr.get(i))) {
				sb.append(arr.get(i) + " ");
				q.clear();
			}else {
				q.add(arr.get(i));
			}
		}
		
		return sb;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			arr.add(sc.nextInt());
		}
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			arr.add(sc.nextInt());
		}
		System.out.print(solution(a,b,arr));
	}

}
