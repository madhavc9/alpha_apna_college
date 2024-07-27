// Queue Implementation Using LinkedList

package lecture;

public class L_27_3 {
	
	static class Node{
		int data;
		Node next;
	
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
		
		static class Queue{
			static Node head =null;
			static Node tail = null;
			//isEmpty function 
			public static boolean isEmpty() {
				return head==null && tail==null;
			}
			
			// add function
			public static void add(int data) {
				Node newNode=new Node(data);
				if(head==null) {
					head=tail=newNode;
					return;
				}
				tail.next=newNode;
				tail=newNode;
			}
			
			// remove 
			public static int remove() {
				if(isEmpty()) {
					System.out.println("Empty queue");
					return -1;
				}
				int front=head.data;
				
				if(tail==head) {
					tail=head=null;
				} else {
					head=head.next;
				}
				return front;
			}
			
			// peek function 
			public static int peek() {
				if(isEmpty()) {
					System.out.println("empty queue");
					return -1;
				}
				return head.data;
			}
		}

	public static void main(String[] args) {
		// making object of queue
		Queue q= new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}
}
