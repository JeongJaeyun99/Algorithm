package section_2;

import java.util.Scanner;

public class 임시반장_정하기 {

	public static int solution(int a,int arr[][]) {
		int answer = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				for(int k = 0;k < 5;k++) {
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break;
					}
				}
			}
			if(cnt > max) {
				max =cnt;
				answer = i;
			}
		}
		return answer+1; // 인덱스+1
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[][] = new int[a][5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(a,arr));
	}

}
