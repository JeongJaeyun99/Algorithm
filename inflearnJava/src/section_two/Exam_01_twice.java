package section_two;

import java.util.Arrays;
import java.util.Scanner;

public class Exam_01_twice {

	public static int[] solution(int n,int arr1[],int m,int arr2[]) {
		int answer[] = new int[n+m];
		int index = 0;
		for (int i = 0; i < n; i++) {
			answer[index++] = arr1[i];
		}
		for (int i = 0; i < m; i++) {
			answer[index++] = arr2[i];
		}
		Arrays.sort(answer);
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int arr2[] = new int[m];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < solution(n,arr1,m,arr2).length; i++) {
			if(i == solution(n,arr1,m,arr2).length-1) {
				System.out.print(solution(n,arr1,m,arr2)[i]);
			}else {
				System.out.print(solution(n,arr1,m,arr2)[i] + " ");
			}
		}
	}

}
