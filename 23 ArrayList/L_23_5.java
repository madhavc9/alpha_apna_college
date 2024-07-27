// Sorting in Arraylist using inbuilt method sort of the class collections 

package lecture;
import java.util.*;
public class L_23_5 {


	public static void main(String[] args) {
		 ArrayList <Integer> list = new ArrayList <> ();
		 list.add(2);
		 list.add(5);
		 list.add(9);
		 list.add(3);
		 list.add(6);
		 System.out.println(list);
		 Collections.sort(list);
		 System.out.println(list);
		 // to sort in DESCENDING ORDER 
		 Collections.sort(list,Collections.reverseOrder());
		 System.out.println(list);
	}
}
