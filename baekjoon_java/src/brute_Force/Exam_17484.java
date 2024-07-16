package brute_Force;

import java.io.*;

public class Exam_17484 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String gs[] = br.readLine().split(" ");
		int n = Integer.parseInt(gs[0]);
		int m = Integer.parseInt(gs[1]);
		int arr[][] = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			String temp[] = br.readLine().split(" ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(temp[j]);
			}
		}
		
	}

}
