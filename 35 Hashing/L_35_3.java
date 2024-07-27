// linked hash map
package lecture;
import java.util.*;
public class L_35_3 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm = new HashMap<>();
		hm.put("India",100);
		hm.put("China",150);
		hm.put("US",50);
		System.out.println("Hash Map");
		System.out.println(hm);
		System.out.println();
		
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
		lhm.put("India",100);
		lhm.put("China",150);
		lhm.put("US",50);
		System.out.println("Linked Hash Map");
		System.out.println(lhm);
		System.out.println();
		
		TreeMap<String,Integer> tm = new TreeMap<>();
		tm.put("India",100);
		tm.put("China",150);
		tm.put("US",50);
		System.out.println("Tree Map");
		System.out.println(tm);
		System.out.println();
		// here output in sorted order of keys
		// ie first C , then I , thn U
		
	}
		
	
	}

