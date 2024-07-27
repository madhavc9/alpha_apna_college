// check if it is prime or not 

/**
package Java_vacationn;

public class L_11_9 {
	
	public static boolean isitPrime(int n) {
		boolean isPrime = true ;
		for (int i =2 ;i<n;i++) {
			if (n%i == 0) {
				isPrime = false ;
				break ;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		System.out.println(isitPrime(13));
	}
}
**/

// suno idhr without using isPrime variable we can directly do 



package CW_vacation_alpha;
public class CW_11_9 {
	public static boolean isitPrime(int n) {
		for (int i =2 ;i<n;i++) {
			if (n%i == 0) {
				return false ;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isitPrime(15));
	}
}

//corner cases 
/**
n always positive 
if n =1 thn nor compositive nor prime
for n =  2 its prime 
 **/