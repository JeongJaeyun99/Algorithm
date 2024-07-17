package binary_search;

import java.io.*;
import java.util.*;

public class Exam_10815 {
	
	public static int bs(int arr1[],int target,int left,int right) {
		if(left > right) return 0;
			
		int mid = (left + right) / 2;
		
		if(arr1[mid] == target) return 1;
		else if(arr1[mid] > target) {
			return bs(arr1,target,left,mid-1);
		}else {
			return bs(arr1,target,mid+1,right);
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int arr1[] = new int[n];
		String s1[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr1[i] = Integer.parseInt(s1[i]);
		}
		Arrays.sort(arr1);
		int m = Integer.parseInt(br.readLine());
		String s2[] = br.readLine().split(" ");
		int arr2[] = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = Integer.parseInt(s2[i]);
		}
		int answer[] = new int[m];
		for (int i = 0; i < arr2.length; i++) {
			int left = 0;
			int right = arr1.length-1;
			answer[i] = bs(arr1,arr2[i],left,right);
			System.out.print(answer[i] + " ");
		}
	}

}
