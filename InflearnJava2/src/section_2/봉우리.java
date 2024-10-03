package section_2;

import java.util.Scanner;

public class 봉우리 {
	
	static int dx[] = {-1,0,1,0};
	static int dy[] = {0,1,0,-1}; // 시계방향
	
	public static int solution(int a,int arr[][]) {
		int answer = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				boolean flag = true;
				for (int k = 0; k < 4; k++) {
					int nx = i + dx[k];
					int ny = j + dy[k];
					// 경계선 조건 + 봉우리 조건(arr[nx][ny] >= arr[i][j]) 
					// 경계선은 계산을 안해도 되므로 거르기
					if(nx >= 0 && nx < a && ny >= 0 && ny < a && arr[nx][ny] >= arr[i][j] ) {
						flag = false;
						break;
					}
				}
				if(flag) answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[][] = new int[a][a];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(solution(a,arr));
	}
}
