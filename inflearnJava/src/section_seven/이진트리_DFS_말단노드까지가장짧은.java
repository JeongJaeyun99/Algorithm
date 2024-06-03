package section_seven;

import java.util.*;
// 이진트리 _ DFS

//class Node{
//	int data;
//	Node lt,rt;
//	public Node(int val) {
//		data = val;
//		lt = rt = null;
//	}
//}

public class 이진트리_DFS_말단노드까지가장짧은 {
	Node root;
	public int DFS(int L,Node root) { // root는 100번지 즉, 루트노드
		if(root.lt == null && root.rt == null) { // 왼쪽,오른쪽이 없는 말단노드일때
			return L;
		}else return Math.min(DFS(L+1,root.lt),DFS(L+1,root.rt));
	}
	public static void main(String[] args) {
		이진트리_DFS_말단노드까지가장짧은 tree = new 이진트리_DFS_말단노드까지가장짧은();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.DFS(0,tree.root));
	}

}
