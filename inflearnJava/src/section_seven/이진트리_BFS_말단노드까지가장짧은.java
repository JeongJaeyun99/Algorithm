package section_seven;

import java.util.*;
// ����Ʈ�� _ DFS

//class Node{
//	int data;
//	Node lt,rt;
//	public Node(int val) {
//		data = val;
//		lt = rt = null;
//	}
//}

public class ����Ʈ��_BFS_���ܳ���������ª�� {
	Node root;
	public int DFS(Node root) { // root�� 100���� ��, ��Ʈ���
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
		����Ʈ��_BFS_���ܳ���������ª�� tree = new ����Ʈ��_BFS_���ܳ���������ª��();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.DFS(tree.root));
	}

}
