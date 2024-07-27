// QUEUE IMPLEMENTATION USING DEQUE

package lecture;
import java.util.*;
public class L_27_12 {

	static class Queue {
		Deque <Integer> deque = new LinkedList <> ();
		
		public void add(int data) {
			deque.addLast(data);
		}
		public int remove() {
			return deque.removeFirst();
		}
		public int peek() {
			return deque.getFirst();
		}
	}
	public static void main(String[] args) {
		Queue q = new Queue ()
;		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println("peek="+ q.peek());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());

	}

}
