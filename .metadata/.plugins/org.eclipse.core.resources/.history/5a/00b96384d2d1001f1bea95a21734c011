package queue;

public class MyQueue {
	private int capacity;
	private int front , rear;
	int[]q;
	int ele;
	int size;
	
	public MyQueue(int capacity) {
		this.capacity = capacity;
		this.q=new int[this.capacity];
		this.front=this.rear = -1;
	}
	
	// Add element inside queue
	public void enQueue(int ele) {
		if(this.rear == this.capacity-1) {
			System.out.println("Queue is full!!!");
			return;
		}
		if(this.front == -1)
			this.front = 0;
		
		q[++rear] = ele;
		this.size++;
		System.out.println(ele+" has been EnQueued");
	}
	
	//To remove as well as return the first element in Queue
	public int deQueue() {
		if(this.front == -1) {
			System.out.println("Queue is Empty");
			return -1;
		}
		int ele = this.q[this.front];
		
		if(this.front == this.rear)
			this.front = this.rear =-1;
		else
			this.front++;
		
		this.size--;
		System.out.println(ele+" has been DeQueued");
		return ele;
			
	}
	
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		if(this.front == -1) {
			return "[]";
		}
		StringBuilder s = new StringBuilder("[");
		for(int i=this.front; i<=this.rear; i++) {
			s.append(q[i]);
			if(i<this.rear)
				s.append(",");
		}
		s.append("]");
		return new String();
	}                                                                            

}
