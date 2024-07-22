package level_3;

import java.io.*;
import java.util.*;

public class Exam_11659 {
	
	static ArrayList<Integer> start = new ArrayList<>();
	static ArrayList<Integer> end = new ArrayList<>();

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int arr[] = new int[n];
		int hap[] = new int[n];
		String s1[] = br.readLine().split(" ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(s1[i]);
		}
		hap[0] = arr[0];
		for (int i = 1; i < hap.length; i++) {
			hap[i] = hap[i-1] + arr[i];
		}
		for (int i = 0; i < m; i++) {
			String s2[] = br.readLine().split(" ");
			start.add(Integer.parseInt(s2[0]));
			end.add(Integer.parseInt(s2[1]));
		}
		for (int i = 0; i < m; i++) {
			int st = start.get(i);
			int ed = end.get(i);
			if(st == 1) {
				System.out.println(hap[ed-1]);
			}else {
				System.out.println(hap[ed-1] - hap[st-2]);
			}
		}
	}

}
