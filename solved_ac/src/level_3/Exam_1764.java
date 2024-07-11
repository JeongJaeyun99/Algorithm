package level_3;

import java.util.*;

public class Exam_1764 {
	
	static ArrayList<String> answer = new ArrayList<>();
	static HashMap<String,Integer> map = new HashMap<>();
	
	public static void solution() {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 2) {
				answer.add(entry.getKey());
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();		
		for (int i = 0; i < n+m; i++) {
			String temp = sc.next();
			map.put(temp,map.getOrDefault(temp, 0) + 1);
		}
		solution();
		Collections.sort(answer);
		System.out.println(answer.size());
		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}

}
