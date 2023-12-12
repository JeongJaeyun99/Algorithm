package level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		int numbers[] = {2,1,3,4,1};
		Solution1 s = new Solution1();
		int arr[] = s.solution(numbers);
		System.out.println(Arrays.toString(arr));
	}

}
class Solution1 {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i < numbers.length-1;i++){
            for(int j = i+1;j < numbers.length;j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        for (int i = 0; i < answer.length; i++) {
			answer[i] = it.next();
		}
        return answer;
    }
}