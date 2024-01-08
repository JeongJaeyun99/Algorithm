package solved_ac_greedy;

import java.util.*;

public class Exam_2865 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		Map<Integer, Float> genre = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int numFirst = sc.nextInt();
			float pointFirst = sc.nextFloat();
			genre.put(numFirst,pointFirst);
		}
		for (int i = 0; i < m-1; i++) {
			for (int j = 0; j < n; j++) {
				int num = sc.nextInt();
				float point = sc.nextFloat();
				if(point > genre.get(num)) {
					genre.put(num, point);
				}
			}
		}
		float temp[] = new float[n];
		for (int i = 0; i < n; i++) {
			temp[i] = genre.get(i+1);
		}
		Arrays.sort(temp);
		float sum = 0;
		for (int i = 1; i <= k; i++) {
			sum += temp[temp.length-i];			
		}
		System.out.println(Math.round(sum * 10.0) / 10.0);
	}

}
