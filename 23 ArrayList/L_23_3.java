// Find maximum elements 

package lecture;
import java.util.*;
public class L_23_3 {

	public static void main(String[] args) {
		 ArrayList <Integer> list = new ArrayList <> ();
		 list.add(2);
		 list.add(5);
		 list.add(9);
		 list.add(3);
		 list.add(6);
		 int max =Integer.MIN_VALUE;
		 int size = list.size();
		 
		 // printing reverse using for loop
		 
		 for (int i=0;i<size;i++) {
			if(list.get(i)>max) {
				max=list.get(i);
			}
		 }
		 System.out.print(max);
	}
}
