package section_3;

import java.util.*;

public class 두_배열_합치기 {

	public static ArrayList solution(int a,int b,int arr1[],int arr2[]) {
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < a; i++) {
			arr.add(arr1[i]);
		}
		for (int i = 0; i < b; i++) {
			arr.add(arr2[i]);
		}
		Collections.sort(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr1[] = new int[a];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int b = sc.nextInt();
		int arr2[] = new int[b];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < a+b; i++) {
			System.out.print(solution(a,b,arr1,arr2).get(i) + " ");
		}
	}

}
