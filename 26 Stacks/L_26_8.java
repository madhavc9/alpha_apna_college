// NEXT GREATER ELEMENT OF ARRAY USING STACK


package lecture;
import java.util.*;

public class L_26_8 {

	public static void main(String[] args) {
		int arr[]= {6,8,0,1,2};
		// creating stack using inbuilt function
		Stack<Integer> s = new Stack <> ();
		// next array of same length
		int nxtGreater[]=new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			// step 1 : while loop chalakar dekhna ki jb tb 
			//stack empty nahi ho jaata ya jb tk bde element nahi aajate pop krte chale jaana 
			while(!s.isEmpty() && arr[s.peek()]<=arr[i]) {
				// also here pushing the index of element into stack  
				s.pop(); 
			}
			
			// if else to check agar empty thn return -1 
			if(s.isEmpty()) {
				nxtGreater[i]=-1;
			}else {
				nxtGreater[i]=arr[s.peek()];
			}
			// push the element into stack 
			s.push(i);
		}
		for (int i=0;i<nxtGreater.length;i++) {
			System.out.print(nxtGreater[i]+" ");
		}
		System.out.println();
	}

}
