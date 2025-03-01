package doubly_linked_list;

public class MyDoublyLinkedList {
    private Node head;
    private Node tail; // Added tail pointer for efficiency

    private class Node {
        Object ele;
        Node next;
        Node prev;

        Node(Object ele) {
            this.ele = ele;
        }
    }

    // Insert element at the beginning
    public void insertFirst(Object ele) {
        Node newNode = new Node(ele);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Insert element at the end
    public void insertLast(Object ele) {
        Node newNode = new Node(ele);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Remove and return the first element
    public Object deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }
        Object ele = head.ele;
        head = head.next;
        if (head != null)
            head.prev = null;
        else
            tail = null; // If list is now empty, update tail as well
        return ele;
    }

    // Remove and return the last element
    public Object deleteLast() {
        if (tail == null) {
            System.out.println("List is empty");
            return null;
        }
        Object ele = tail.ele;
        tail = tail.prev;
        if (tail != null)
            tail.next = null;
        else
            head = null; // If list is now empty, update head as well
        return ele;
    }

    // Display the list (for testing)
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.ele + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();

        list.insertFirst(10);
        list.insertLast(20);
        list.insertLast(30);
        list.insertFirst(5);

        System.out.print("List after insertions: ");
        list.display(); // Expected: 5 <-> 10 <-> 20 <-> 30 <-> null

        System.out.println("Deleted First: " + list.deleteFirst()); // 5
        System.out.println("Deleted Last: " + list.deleteLast());   // 30

        System.out.print("List after deletions: ");
        list.display(); // Expected: 10 <-> 20 <-> null
    }
}
