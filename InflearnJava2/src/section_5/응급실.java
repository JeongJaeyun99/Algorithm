package section_5;

import java.util.*;

class Person{
	int id;
	int priority;
	public Person(int id,int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class ¿¿±ﬁΩ« {
	public static int solution(int a,int k,int arr[]) {
		int answer = 1;
		Queue<Person> q = new LinkedList<>();
		for (int i = 0; i < arr.length; i++) {
			q.offer(new Person(i,arr[i]));
		}
		while(!q.isEmpty()) {
			Person tmp = q.poll();
			for(Person x : q) {
				if(x.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null) {
				if(tmp.id == k) return answer;
				else answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(a,k,arr));
	}

}
