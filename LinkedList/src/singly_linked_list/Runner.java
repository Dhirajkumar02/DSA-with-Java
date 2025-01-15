package singly_linked_list;

public class Runner {
	public static void main(String[] args) {
		MySinglyLinkedList sl = new MySinglyLinkedList();
		System.out.println(sl);
		System.out.println(sl.size());
		
		sl.add(10);
		System.out.println(sl);
		System.out.println(sl.size());
		
		sl.add(20);
		System.out.println(sl);
		System.out.println(sl.size());
		
		sl.add(30);
		System.out.println(sl);
		System.out.println(sl.size());
		
		sl.add(40);
		System.out.println(sl);
		System.out.println(sl.size());
		
		sl.add(50);
		System.out.println(sl);
		System.out.println(sl.size());
		
		System.out.println("---------------");
		sl.add(60);
		System.out.println(sl);
		System.out.println(sl.size());
	}

}
