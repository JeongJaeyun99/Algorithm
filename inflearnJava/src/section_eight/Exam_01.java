package section_eight;

import java.util.*;

public class Exam_01 {
	
	static String answer = "NO";
	static int n,total=0;
	static boolean flag = false; // yes�߰ߵǸ� �� ���� ��� �� �糤��.
	public static void DFS(int L,int sum,int arr[]) {
		if(flag) return; // �´°��� ������ �� ���� ��� �� �糢�� �ȴ�.
		if(sum > total / 2) return; // sum�� total�� ������ ������ �ǹ� X�̹Ƿ�
		if(L == n) {
			if((total-sum) == sum) {
				answer = "YES";
				flag = true;
			}
		}
		else {
			DFS(L+1,sum+arr[L],arr); // L��° ����ϰڴ�.
			DFS(L+1,sum,arr); // L��° ��������ʰڴ�.
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		DFS(0,0,arr);
		System.out.println(answer);
	}

}
