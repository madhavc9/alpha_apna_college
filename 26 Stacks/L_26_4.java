// PUSH AT BOTTOM OF STACK

package lecture;
import java.util.*;
public class L_26_4 {

	public static void pushatbottom(Stack<Integer> s, int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		// recursive function
		int top=s.pop();
		pushatbottom(s,data);
		s.push(top);
	}
	
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		// calling push at bottom function
		pushatbottom(s,4);
		System.out.println(s);
		// here while printing 4 , 1 , 2 , 3
		// means 3 at top and 4 at bottom 
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	
	}

}
