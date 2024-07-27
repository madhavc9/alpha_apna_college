// Priority Queue Implementation Java
package lecture;

import java.util.*;
public class L_34_1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());
		pq.add(3);
		pq.add(4);
		pq.add(1);
		pq.add(7);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.remove();
		}

	}

}
