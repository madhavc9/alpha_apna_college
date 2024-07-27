// Swap 2 numbers 

package lecture;
import java.util.*;
public class L_23_4 {

	public static void swap ( ArrayList <Integer> list ,int idx1 ,int idx2) {
		int temp=list.get(idx1);
		list.set(idx1,(list.get(idx2)));
		list.set(idx2,temp);
		int size = list.size();
		for (int i=0;i<size;i++) {
			System.out.print(list.get(i)+" ");
		}

	}
	public static void main(String[] args) {
		 ArrayList <Integer> list = new ArrayList <> ();
		 list.add(2);
		 list.add(5);
		 list.add(9);
		 list.add(3);
		 list.add(6);
		 swap(list,1,3);
	}
}
