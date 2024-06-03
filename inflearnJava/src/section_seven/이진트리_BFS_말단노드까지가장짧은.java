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

public class 이진트리_BFS_말단노드까지가장짧은 {
	Node root;
	public int DFS(Node root) { // root는 100번지 즉, 루트노드
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for (int i = 0; i < len; i++) {
				Node cur = q.poll();
				if(cur.lt == null && cur.rt == null) {
					return L;
				}
				if(cur.lt != null) q.offer(cur.lt);
				if(cur.rt != null) q.offer(cur.rt);
			}
			L++;
		}
		return 0;
	}
	public static void main(String[] args) {
		이진트리_BFS_말단노드까지가장짧은 tree = new 이진트리_BFS_말단노드까지가장짧은();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.DFS(tree.root));
	}

}
