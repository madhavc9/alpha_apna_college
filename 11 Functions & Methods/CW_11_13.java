// Decimal to Binary

package CW_vacation_alpha;

public class CW_11_13 {

	public static void dec2bin (int n) {
		int thenum = n ;
		int pow = 0;
		int res = 0;
		
		while (n>0) {
			int rem = n%2 ;
			res = res + (rem*(int)Math.pow(10,pow));
			pow ++;
			n = n/2;
		}
		System.out.println("Binary value of " + thenum + " is " + res );
	}
	public static void main(String[] args) {
		dec2bin(12);
	}

}
