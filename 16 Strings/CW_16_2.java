// CHECK IF STRING IS A VALID PALLINDROME 

package CW_vacation_alpha;
import java.util.*;

public class CW_16_2 {

	public static boolean isPallindrome (String str ) {
		int n = str.length();
		for (int i = 0; i<=n/2;i++) {
			if(str.charAt(i)==str.charAt(n-1-i)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Input your string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(isPallindrome(str));
	}

}
