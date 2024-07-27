// REVERSE A STRING USING STACK

package lecture;
import java.util.*;
public class L_26_5 {

	public static String revstring(String str) {
		Stack<Character> s = new Stack<>();
		int size=str.length();
		for(int i=0;i<size;i++) {
			s.push(str.charAt(i));
		}
		StringBuilder result=new StringBuilder("");
		for(int i=0;i<size;i++) {
			char  c =s.pop();
			result.append(c);
		}
		return result.toString();
		
	}
	public static void main(String[] args) {
		String str="abc";
		String result = revstring(str);
		System.out.println(result);
	}
}
