package section_6;

import java.util.*;

public class 이분_검색 {
	
	public static int solution(int n,int m,int arr[]) {
		int answer = 0;
		int lt = 0;
		int rt = arr.length-1;
		Arrays.sort(arr);
		while(lt <= rt) {
			int mid = (lt+rt)/2;
			if(arr[mid] == m){
				answer = mid+1;
				break;
			}
			if(arr[mid] > m) rt = mid-1;
			else {
				lt = mid+1;
			}
		}
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
		System.out.println(solution(n,m,arr));
	}

}
