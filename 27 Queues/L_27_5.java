// QUEUE USING TWO STACK 

package lecture;
import java.util.*;
 
public class L_27_5 {

	static class Queue{
		static Stack <Integer> s1=new Stack<>();
		static Stack <Integer> s2=new Stack<>();
		
		//check if s1 empty
		public static boolean isEmpty() {
			return s1.isEmpty();
		}
		
		// adding the elements into stack  
		// time complexity -O(n)
		// two while loop running so O(n)+O(n)=O(n)
		public static void add(int data) { 
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(data);
			
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		// remove function
		public static int remove() {
			if(isEmpty()) {
				System.out.println("queue empty");
				return -1;
			}
			return s1.pop();
		}
		// peek
		public static int peek() {
			if(isEmpty()) {
				System.out.println("queue empty");
				return -1;
			}
			return s1.peek();
		}
	}
	
	public static void main(String[] args) {
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
