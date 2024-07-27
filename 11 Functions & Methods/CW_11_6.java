// function to find binomial coefficient using the helper fn (factorial)

package CW_vacation_alpha;

import java.util.Scanner;

public class CW_11_6 {

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

	public static int binomialc (int n , int r) {
		int x =factorial(n);
		int y =factorial(r);
		int z =factorial(n-r);
		int result = x/(y*z);
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Enter n and r to find the binomial coefficient :");
		Scanner sc = new Scanner (System.in);
		int n =sc.nextInt();
		int r =sc.nextInt();
		System.out.println("Calculated Binomial coefficient is :" + binomialc(n,r));
	}

}
