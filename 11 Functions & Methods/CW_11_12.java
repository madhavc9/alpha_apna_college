// convert from binary to decimal

package CW_vacation_alpha;

public class CW_11_12 {

	public static void bintodec(int n) {
		int binarynum = n ;
		int pow = 0;
		int decimal = 0;
		
		while (n>0) {
		int ld = n%10;
		decimal = decimal + (ld*(int)Math.pow(2,pow));
		pow ++;
		n=n/10;
		}
		
		System.out.println("Decimal value of " + binarynum + " is " + decimal );
	}
	 
	public static void main(String[] args) {
		 bintodec(1111);
	}

}
