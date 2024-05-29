package section_six;

import java.util.*;

public class Exam_08 {
	public static int solution(int n,int m, int arr[]) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0;
		int rt = arr.length-1;
		while(lt <= rt) {
			int mid = (lt+rt) / 2;
			if(arr[mid] == m) {
				return mid+1;
			}
			if(arr[mid] > m) {
				rt = mid - 1;
			}else {
				lt = mid + 1;
			}
		}
//		TreeSet<Integer> tree = new TreeSet<Integer>();
//		for (int i = 0; i < arr.length; i++) {
//			tree.add(arr[i]);
//		}
//		int index = 1;
//		for(int x : tree) {
//			if(x == m) {
//				return index;
//			}
//			index++;
//		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(solution(n, m, arr));
	}
}
