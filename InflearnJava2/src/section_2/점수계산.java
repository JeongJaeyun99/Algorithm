package section_2;

import java.util.Scanner;

public class 점수계산 {

	public static int solution(int a,int arr[]) {
		int answer = 0;
		int bonus = 1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) {
				answer += bonus;
				bonus++;
			}else {
				bonus = 1;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(a,arr));
	}

}
