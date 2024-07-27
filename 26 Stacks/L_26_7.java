// stock span problem 

package lecture;
import java.util.*;
 
public class L_26_7 {

	// stock span function 
	public static void stockSpan(int stocks[],int span[]) {
		// stack initialise 
		Stack<Integer> s =new Stack <> ();
		span[0]=1; // already define for the first
		s.push(0); // push 0 into stack 
		
		for(int i=1;i<stocks.length;i++) {
			int currPrice=stocks[i]; // for comparison 
			while(!s.isEmpty()&&currPrice>stocks[s.peek()]) {
				s.pop();
			}
			if(s.isEmpty()) {
				span[i]=i+1;
			} else {
				int prevHigh=s.peek();// for subtraction 
				span[i]=i-prevHigh;
			}
			s.push(i);// after all work push i into stack 
		}
		
	}
	public static void main(String[] args) {
		int stocks[]= {100,80,60,70,60,85,100};
		int span[]=new int[stocks.length];
		stockSpan(stocks,span);
		
		for (int i=0;i<span.length;i++) {
			System.out.println(span[i]+"");
		}

	}

}
