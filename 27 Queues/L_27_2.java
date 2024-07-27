// Circular Queue Implementation Using Arrays 

package lecture;

public class L_27_2 {
	
	static class Queue{
		static int arr[];
		static int size;
		static int rear; 
		// in circular queue store front 
		// also bcz yhan front change hote rehta phle hmesha 0 rehta tha  
		static int front;
		
		Queue(int n){
			arr=new int[n];
			size=n;
			rear=-1;
			front = -1;
		}
		
		//isEmpty function 
		public static boolean isEmpty() {
			return rear==-1 && front==-1;
		}
		
		//isFull function 
				public static boolean isFull() {
					return (rear+1)%size == front;
				}
		 
		
		// add function
		public static void add(int data) {
			if(isFull()) {
				System.out.println("queue is full");
				return;
			}
			// this extra condition
			// if adding the element first time 
			if(front==-1) {
				front=0;
			}
			rear=(rear+1)%size;
			arr[rear]=data;
		}
		
		// remove 
		public static int remove() {
			if(isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			
			int result=arr[front];
			// yahan loop tha phle ab loop nahi ab O(1) mae implement krenge 
			
			// agr pure queue mae single element thn front rear dono ko update 
				if(rear==front) {
					rear=front=-1;
				}else {
					front=(front+1)%size;
				}
			return result;
		}
		
		// peek function 
		public static int peek() {
			if(isEmpty()) {
				System.out.println("empty queue");
				return -1;
			}
			return arr[front];
		}
		
	}

	public static void main(String[] args) {
		// making object of queue
		Queue q= new Queue(3);
		q.add(1);
		q.add(2);
		q.add(3);
		// some condition that only on circular queue
		System.out.println(q.remove());
		q.add(4);
		System.out.println(q.remove());
		q.add(5);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
