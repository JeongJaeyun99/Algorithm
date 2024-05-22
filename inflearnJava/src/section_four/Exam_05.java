package section_four;

import java.util.*;

public class Exam_05 {
	
	public static int solution(int n,int k, int arr[]) {
		// treeset을 써서 하면 개빠르다ㄷㄷㄷㄷ 정렬 + 중복제거해줌. 
		// 그래서 끝에서부터 카운트하면서 k번째로 큰것만 찾으면 된다.
		int answer = 0;
		Arrays.sort(arr);
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = arr.length-1; i > -1; i--) {
			for (int j = i-1; j > -1; j--) {
				for (int j2 = j-1; j2 > -1; j2--) {
					set.add(arr[i] + arr[j] + arr[j2]);
				}
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int x : set) {
			list.add(x);
		}
		Collections.sort(list);
		if (k > list.size()) {
			return -1;  
		}
		answer = list.get(list.size()-k);
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(solution(n,k,arr));
	}

}
