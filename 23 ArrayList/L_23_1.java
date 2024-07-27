// Creating arraylist and operations on arraylist 

package lecture;
import java.util.ArrayList;
public class L_23_1 {

	public static void main(String[] args) {
		// syntax for creating the integer arraylist
		ArrayList <Integer> list = new ArrayList<>();
		// adding elements into arraylist
		list.add(1);
		list.add(4); 
		list.add(7);
		list.add(3);
		System.out.println(list);
		System.out.println(list.get(2));
		list.remove(1);
		System.out.println(list);
		list.add(4);
		list.add(6);
		list.add(5);
		System.out.println(list);
		list.set(1,2);
		System.out.println(list);
		System.out.println(list.contains(3));
		System.out.println(list.contains(7));  
		System.out.println(list.size());
	}

}
