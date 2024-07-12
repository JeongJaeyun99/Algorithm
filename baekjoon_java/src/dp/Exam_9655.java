package dp;

import java.io.*;

public class Exam_9655 {
	
	public static void solution(int n) {
		if(n % 2 == 0) {
			System.out.println("CY");
		}else {
			System.out.println("SK");
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		solution(n);
	}

}
