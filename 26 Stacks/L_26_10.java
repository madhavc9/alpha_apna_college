// Duplicate parenthesis code 

package lecture;
import java.util.*;
public class L_26_10 {

	public static boolean isDuplicate(String str) {
		Stack <Character > s= new Stack <> ();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
		
			// case : closing bracket 
			if(ch==')') 
			{
				int count = 0;
				// as it is valid string so isempty nahi hoga while ) this comes 
				while(s.peek()!='(') 
				{
					s.pop();
					count++;
				}
				if(count<1) 
				{
					return true;// duplicate
				} else {
					s.pop(); // opening pair
				}
			}
				else {
					// case 2 : opening , operator , operands 
					s.push(ch);
				}
			}
		 	return false;
		}
	 
	public static void main(String[] args) {
		String str1 = "((a+b))";
		String str2 = "(a-b)";
		System.out.println(isDuplicate(str1));
		System.out.println(isDuplicate(str2));
	}

}
