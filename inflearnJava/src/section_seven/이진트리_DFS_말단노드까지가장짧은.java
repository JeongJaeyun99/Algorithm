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

public class ����Ʈ��_DFS_���ܳ���������ª�� {
	Node root;
	public int DFS(int L,Node root) { // root�� 100���� ��, ��Ʈ���
		if(root.lt == null && root.rt == null) { // ����,�������� ���� ���ܳ���϶�
			return L;
		}else return Math.min(DFS(L+1,root.lt),DFS(L+1,root.rt));
	}
	public static void main(String[] args) {
		����Ʈ��_DFS_���ܳ���������ª�� tree = new ����Ʈ��_DFS_���ܳ���������ª��();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.DFS(0,tree.root));
	}

}
