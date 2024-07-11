package level_3;

import java.util.*;
import java.io.*;

public class Exam_1620 {
	
	static HashMap<String,Integer> dogam = new HashMap<>();
	static String problem[];
	
	public static void solution() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < problem.length; i++) {
			if(Character.isAlphabetic(problem[i].charAt(0))) {
				sb.append(dogam.get(problem[i]) + 1).append("\n");
			}else {
				int index = Integer.parseInt(problem[i]) - 1;
				for(Map.Entry<String, Integer> entry : dogam.entrySet()) {
					if(entry.getValue() == index) {
						sb.append(entry.getKey()).append("\n");
						break;
					}
				}
			}
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String dogamAndProblemCnt = br.readLine();
		String arr[] = dogamAndProblemCnt.split(" ");
		int dogamCnt = Integer.parseInt(arr[0]);
		int problemCnt = Integer.parseInt(arr[1]);
		problem = new String[problemCnt];
		for (int i = 0; i < dogamCnt; i++) {
			dogam.put(br.readLine(),i);
		}
		for (int i = 0; i < problem.length; i++) {
			problem[i] = br.readLine();
		}
		solution();
	}

}
