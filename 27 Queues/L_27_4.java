// Queue implementation using JCF 
// ie with help of linkedlist class or deque class 

package lecture;
import java.util.*;
public class L_27_4 {

	public static void main(String[] args) {
		Queue <Integer> q=new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}
		System.out.println();
		Queue <Integer> q1=new ArrayDeque<>();
		q1.add(4);
		q1.add(5);
		q1.add(6);
		while(!q1.isEmpty()) {
			System.out.println(q1.peek());
			q1.remove();
		}
		

	}

}
