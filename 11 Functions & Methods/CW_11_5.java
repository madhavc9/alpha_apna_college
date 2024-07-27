// Finding factorial of a number by passing number into a function 

package CW_vacation_alpha;
import java.util.*;
public class CW_11_5 {
	public static int factorial (int n) {
		if (n<0) {
			return 0;
		}
		if (n==0) {
			return 1;
		}
		else {
			int x=1;
			for (int i=1;i<=n;i++) {
				x=x*i;
			}
			return x;
		}
	}
	public static void main(String[] args) {
		System.out.println("For which number you want to find the factorial :");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int x = factorial(n);
		if (x==0) {
			System.out.println("ERROR .. Try Again with the positive integer");
		}
		else {
			System.out.println(factorial(n));
		}	
	}
}
