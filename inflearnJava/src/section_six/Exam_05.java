package section_six;

import java.util.*;

public class Exam_05 {
	public static String solution(int n, int arr[]) {
		String answer = "U";
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				return "D";
			}
		}
		// ³»°¡ Â§ ÄÚµå´Â ¹Ø¿¡
//		Stack<Integer> stack = new Stack<Integer>();
//		for (int i = 0; i < arr.length; i++) {
//			if(stack.contains(arr[i])) {
//				return "D";
//			}else {
//				stack.add(arr[i]);
//			}
//		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(solution(n, arr));
	}
}
