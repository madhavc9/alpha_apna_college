// Optimised way to find prime number 

package CW_vacation_alpha;

public class CW_11_10 {

	public static boolean isitPrime(int n) {
		if (n == 2) {
			return true;
		}
		for (int i=2;i<=Math.sqrt(n);i++) {
			if (n%i==0) {
				return false ;
			}
		}
		return true ;
	}
	public static void main(String[] args) {
		System.out.println(isitPrime(12));

	}

}
