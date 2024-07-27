// Connect n ropes with minimum cost
package lecture;
import java.util.*;

public class L_34_6 {

	public static void main(String[] args) {
		int ropes[]= {2,3,3,4,6};
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		for(int i=0;i<ropes.length;i++) {
			pq.add(ropes[i]);
		}
		int cost=0;
		while(pq.size()>1) {
			int min=pq.remove();
			int min2=pq.remove();
			cost+=min+min2;
			pq.add(min+min2);
		}
		System.out.println("cost of connecting n ropes="+cost);
	}
}
