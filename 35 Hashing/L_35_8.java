// ITERATION ON HASHSETS
// In total there exists two methods
// 1st using iterations , thn next using enhanced forloop

package lecture;
import java.util.*;
public class L_35_8 {

	public static void main(String[] args) {
		HashSet<String> cities=new HashSet<>();
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Noida");
		cities.add("Bangaluru");

		/*
		from line 17 to 20 using iterations
		Iterator it=cities.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		/*
		line 26 to 28 using enhanced for loop or foreach loop
		for(String city : cities) {
			System.out.println(city);
		}
		*/
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		lhs.add("Delhi");
		lhs.add("Mumbai");
		lhs.add("Noida");
		lhs.add("Bangaluru");
		System.out.println(lhs);
		
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Delhi");
		ts.add("Mumbai");
		ts.add("Noida");
		ts.add("Bangaluru");
		System.out.println(ts);
	}

}
