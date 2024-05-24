package section_five;

import java.io.IOException;
import java.util.*;

class Person{
	int id;
	int priority;
	public Person(int id,int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Exam_08 {

	public static int solution(int n, int m, int patients[]) {
		int rank = 1;
		Queue<Person> q = new LinkedList<>();
		for (int i = 0; i < patients.length; i++) {
			q.offer(new Person(i,patients[i]));			
		}
		while (!q.isEmpty()) {
			Person tmp = q.poll();
			for(Person x : q) {
				if(x.priority > tmp.priority) {
					q.offer(tmp);
					tmp = null;
					break;
				}
			}
			if(tmp != null) {
				if(tmp.id == m) return rank;
				else rank++;
			}
		}
		return rank;
	}

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int patients[] = new int[n];
		for (int i = 0; i < patients.length; i++) {
			patients[i] = sc.nextInt();
		}
		System.out.print(solution(n, m, patients));
	}

}
