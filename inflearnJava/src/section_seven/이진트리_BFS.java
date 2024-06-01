package section_seven;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	int data;
	Node lt,rt;
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class 이진트리_BFS {
	Node root;
	public void BFS(Node root) { // root는 100번지 즉, 루트노드
		Queue<Node> q = new LinkedList<>();
		q.offer(root);
		int Level = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			System.out.print(Level + " : ");
			for (int i = 0; i < len; i++) {
				Node cur = q.poll();
				System.out.print(cur.data + " ");
				if(cur.lt != null) q.offer(cur.lt);
				if(cur.rt != null) q.offer(cur.rt);
			}
			Level++;
			System.out.println();
		}	
	}
	public static void main(String[] args) {
		이진트리_BFS tree = new 이진트리_BFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);
	}

}
