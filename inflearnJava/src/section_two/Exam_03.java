package section_two;

import java.util.Scanner;

public class Exam_03 {

	public static StringBuilder solution(int n,int a[],int b[]) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			if(a[i] == b[i]) {
				sb.append("D").append("\n");
			}else if(a[i] == 1) {
				if(b[i] == 2) {
					sb.append("B").append("\n");					
				}else if(b[i] == 3){
					sb.append("A").append("\n");										
				}
			}else if(a[i] == 2) {
				if(b[i] == 1) {
					sb.append("A").append("\n");										
				}else if(b[i] == 3){
					sb.append("B").append("\n");					
				}
			}else if(a[i] == 3) {
				if(b[i] == 1) {
					sb.append("B").append("\n");					
				}else if(b[i] == 2){
					sb.append("A").append("\n");										
				}
			}
		}
		return sb;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		System.out.println(solution(n,a,b));
	}

}
