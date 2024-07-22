package level_3;

import java.util.*;
import java.io.*;

public class Exam_1927 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0 && q.size() == 0) {
				System.out.println(0);
			}else if (a == 0 && q.size() != 0){
				System.out.println(q.poll());
			}else {
				q.offer(a);
			}
		}
	}

}
