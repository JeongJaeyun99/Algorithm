package level_2;

import java.util.*;

public class Exam_30802 {
	
	public static void solution(int people,int size[],int mukum[]) {
		int T = 0;
		for (int i = 0; i < size.length; i++) {
			if((size[i] % mukum[0]) == 0) {
				T += (size[i] / mukum[0]);				
			}else {
				T += (size[i] / mukum[0]) + 1;
			}
		}
		System.out.println(T);
		System.out.print(people / mukum[1] + " " + people % mukum[1]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int size[] = new int[6];
		for (int i = 0; i < size.length; i++) {
			size[i] = sc.nextInt();
		}
		int mukum[] = new int[2];
		for (int i = 0; i < mukum.length; i++) {
			mukum[i] = sc.nextInt();
		}
		solution(people,size,mukum);
	}

}
