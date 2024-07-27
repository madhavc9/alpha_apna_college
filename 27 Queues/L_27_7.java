// FIRST NON REPEATING LETTER 

package lecture;
import java.util.*;
public class L_27_7 {

	public static void printNonRepeating(String str) {
		// frequency array to store frequency of each size being 26 of it
		int freq[]=new int[26];
		// queue create 
		Queue<Character> q= new LinkedList <> ();
		// for loop for iterating to each character of the string 
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			q.add(ch);
			freq[ch-'a']++;
			while(!q.isEmpty()&&freq[q.peek()-'a']>1) {
				q.remove();
			}
			if(q.isEmpty()) {
				System.out.print(-1+" ");
			} else {
				System.out.print(q.peek()+" ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String str="aabccxb";
		printNonRepeating(str);
	}

}
