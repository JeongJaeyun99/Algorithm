package code.plus_브루트포스;

import java.io.*;

public class 문제_2309_일곱난쟁이 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int height[] = new int[9];
		for (int i = 0; i < height.length; i++) {
			height[i] = br.read();
		}
		System.out.println(height[1]);
	}

}
