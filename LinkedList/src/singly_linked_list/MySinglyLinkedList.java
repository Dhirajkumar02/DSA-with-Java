package singly_linked_list;

public class MySinglyLinkedList {
	// Instance Variable of Linked List
	private Node head;
	private int size;
	private class Node{
		// Instance Variable of Node
		Node next;
		Object ele;
		
		// Constructor of Node
		Node(Object ele){
			this.ele = ele;
		}
	}
	//To add element to last of LinkedList
	public void add(Object ele) {
		Node  n = new Node(ele);
		this.size++;
		if(this.head == null) {
			this.head = n;
			return;
		}
		Node temp = this.head;
		
		while(temp.next != null) {
			temp.next = n;
		}
		temp.next = n;
	}
	// To get the number of elements in linkedlist
	
	public int size() {
		return this.size;
	}
	
	public void addFirst(Object ele) {
		Node n = new Node(ele);
		this.size++;
		
		if(this.head == null) {
			this.head = n;
			return;
		}
		else {
			n.next = this.head;
			this.head = n;
		}

	}
	@Override
	public String toString() {
		Node temp = this.head;
		StringBuilder s = new StringBuilder("[");
		while(temp != null) {
			s.append(temp.ele);
			if(temp.next != null)
				s.append("->");
			temp = temp.next;
		}
		s.append("]");
		
		return new String(s);
	}

}
