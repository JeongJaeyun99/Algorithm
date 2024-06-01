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

public class ����Ʈ��_DFS {
	Node root;
	public void DFS(Node root) { // root�� 100���� ��, ��Ʈ���
		if(root == null) {
			return;
		}else {
			//System.out.print(root.data + " ");// ����	
			DFS(root.lt);
			//System.out.print(root.data + " ");// ����	
			DFS(root.rt);
			System.out.print(root.data + " ");// ����	
		}
	}
	public static void main(String[] args) {
		����Ʈ��_DFS tree = new ����Ʈ��_DFS();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}

}
