/*
Java collection framework use krna 
note :
primitive datatypes use nahi krna 
objects are stored 
INTEGER , BOOLEAN , FLOAT , CHAR class use krna prega 
*/

package lectures;

import java.util.LinkedList;
public class L_24_2 {

	public static void main(String[] args) {
		//create 
		LinkedList<Integer> ll = new LinkedList<>();
		// add
		
		ll.addFirst(3);
		ll.addLast(4);
		ll.addFirst(5);
		// print 
		System.out.println(ll);
		// remove 
		ll.removeLast();
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
	}

}
