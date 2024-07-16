package level_3;

import java.io.*;

public class Exam_2579 {
	static int one[];
	static int two[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		one = new int[n+1];
		two = new int[n+1];
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int ch1 = 0;
		for (int i = 1; i < one.length; i++) {
			if(ch1 == 2) {
				ch1 = 1;
				if(i == n) {
					one[i] = one[i-1] + arr[n-1];
				}else {
					one[i] = one[i-1];
				}
			}else {
				one[i] = arr[i-1] + one[i-1];
				ch1++;
			}
		}
		int ch2 = 0;
		for (int i = 2; i < two.length; i++) {
			if(ch2 == 2) {
				ch2 = 1;
				if(i == n) {
					two[i] = two[i-1] + arr[n-1];
				}else {
					two[i] = two[i-1];
				}
			}else {
				two[i] = arr[i-1] + two[i-1];
				ch2++;
			}
		}
		if(one[n] > two[n]) System.out.println(one[n]);
		else System.out.println(two[n]);
	}

}
