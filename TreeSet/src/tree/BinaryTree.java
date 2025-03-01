package tree;

public class BinaryTree {
	private Node root;
	
	private class Node{
		Object ele;
		Node left;
		Node right;
		
		Node(Object ele){
			this.ele = ele;
		}
	}

	public boolean add(Object ele) {
		return false;
		
	}
	public boolean add(Node root, Node n) {
		Comparable obj = (Comparable)n.ele;
		
		if(obj.compareTo(this.root.ele) > 0) {
			
		}
		return false;
		
	}
}
