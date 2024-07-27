// PRIME IN A RANGE 

package CW_vacation_alpha;

public class CW_11_11 {
	
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
	
		public static void PrimeinRange (int n) {
			for (int i=2 ; i<n ;i++) {
				if (isitPrime(i)==true) {
					System.out.print(i +  " ");
				}
			}
		}
	public static void main(String[] args) {
		PrimeinRange(100); 
		// note yha dhyan dene wali baat ki kch return nhi krega 
		// as it is just printing so na hm sirf call krk chhor denge 
	}
}
