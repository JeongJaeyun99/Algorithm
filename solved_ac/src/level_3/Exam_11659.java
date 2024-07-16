package level_3;

import java.io.*;
import java.util.*;

public class Exam_11659 {
	
	static ArrayList<Integer> list = new ArrayList<>();
	
	public static StringBuilder solution() {
		StringBuilder sb = new StringBuilder();
		
		return sb;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		for (int i = 0; i < n; i++) {
			list.add(br.read());
		}
		
		for (int i = 0; i < m; i++) {
			int start = 1;
		}
	}

}
