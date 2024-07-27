// CHECK IF A NUMBER IS ODD OR EVEN

package lecture;

import java.util.*;
public class L_17_2 {

	public static void oddeven (int n) {
		int bitmask = 1;
		if((n&bitmask)==0) {
				System.out.println("Even Numnber");
		}
		else {
			System.out.println("Odd Numnber");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter number:");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		oddeven(n);
	}
}

// note : its not necessary ki 2 binary number k bich hi & operation ho 
// add operations performs on 2 integers actually 