package brute_Force;

import java.util.*;

public class Exam_2309 {

	public static void solution(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		sum -= 100;
		Arrays.sort(arr);
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j != i && arr[i] + arr[j] == sum) {
					for (int k = 0; k < arr.length; k++) {
						if (k != i && k != j) answer.add(arr[k]);
					}
					break;
				}
			}
			if(answer.size() == 7) break;
		}
		Collections.sort(answer);
		for (int j = 0; j < answer.size(); j++) {
			System.out.println(answer.get(j));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		solution(arr);
	}

}
