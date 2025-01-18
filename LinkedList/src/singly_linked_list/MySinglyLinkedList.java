package singly_linked_list;

public class MySinglyLinkedList {
    // Instance Variables of Linked List
    private Node head;
    private int size;

    // Nested Node Class
    private class Node {
        // Node Variables
        Node next;
        Object ele;

        // Constructor of Node
        Node(Object ele) {
            this.ele = ele;
        }
    }

    // To add an element to the last of the LinkedList
    public void add(Object ele) {
        Node n = new Node(ele);
        this.size++;
        if (this.head == null) {
            this.head = n;
            return;
        }
        Node temp = this.head;
        while (temp.next != null) { // Traverse to the end
            temp = temp.next;
        }
        temp.next = n; // Add new node at the end
    }

    // To get the number of elements in LinkedList
    public int size() {
        return this.size;
    }

    // To add an element to the start of the LinkedList
    public void addFirst(Object ele) {
        Node n = new Node(ele);
        this.size++;

        if (this.head == null) {
            this.head = n;
        } else {
            n.next = this.head;
            this.head = n;
        }
    }

    // To return and remove the first node from the list
    public Object deleteFirst() {
        if (this.head == null) {
            System.out.println("List is empty!");
            return null;
        }
        this.size--;
        Object data = this.head.ele;
        this.head = this.head.next;
        return data;
    }
    
 // To return and remove the last node from the list

    public Object deleteLast() {
		if(this.head == null) {
			System.out.println("List is empty");
			return null;
			
		}
		this.size--;
		Node prev = null;
		Node temp = this.head;
		
		while(temp.next != null) {
			prev = temp;
			temp =temp.next;
		}
		Object data = temp.ele;
		if(prev == null)
			this.head = null;
		else
			prev.next = null;
		return data;
	}
    
    // To add element of specified index 
    void add(Object ele, int in) {
    	Node n = new Node(ele);
    	if(in == 0) {
    		n.next = this.head;
    		this.head = n;
    		this.size++;
    		return;
    	}
    	Node temp = this.head;
    	while(in > 1 && temp != null) {
    		temp = temp.next;
    		in--;
    	}
    	if(temp == null) {
    		System.out.println("Index is out of range");
    		return;
    	}
    	this.size++;
    	n.next = temp.next;
    	temp.next = n;
    }

    //To delete element to the specified index 
    void delete(Object ele, int in) {
    	if(in == 0) {
    		//return this.deleteFirst();
    		Object data = this.head.ele;
    		this.head = this.head.next;
    		this.size++;
    		return data;
    	}
    	Node temp = this.head;
    	while(in > 1 && temp != null) {
    		temp = temp.next;
    		in--;
    	}
    	if(temp == null) {
    		System.out.println("Index is out of range");
    		return null;
    	}
    	
    }
    // Convert LinkedList to String
    @Override
    public String toString() {
        if (this.head == null) {
            return "[]"; // Empty list case
        }
        Node temp = this.head;
        StringBuilder s = new StringBuilder("[");
        while (temp != null) {
            s.append(temp.ele);
            if (temp.next != null) {
                s.append("->");
            }
            temp = temp.next;
        }
        s.append("]");
        return s.toString();
    }
}
