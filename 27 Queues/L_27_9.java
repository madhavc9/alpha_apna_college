// QUEUE REVERSAL 

package lecture;
import java.util.*;
public class L_27_9 {

	public static void reverse(Queue<Integer> q) {
		Stack<Integer> s = new Stack<>();  
		
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
	}
	public static void main(String[] args) {
		Queue <Integer> q = new LinkedList <> ();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		reverse(q);
		
		//printing the queue
		while(!q.isEmpty()) {
			System.out.print(q.remove()+" ");
		}
		System.out.println("");
	}

}
