//DECIMAL TO BINARY


package com.apnacollege;

public class L_7_14 {

	public static void tobinary(int n) {
		int x=n;
		int pow=0;
		int binnumb=0;
		while(n>0) {
			int rem=n%2;
			binnumb=binnumb+(rem*(int)Math.pow(10,pow));
			pow++;
			n=n/2;
		}
		System.out.println("Binary value for " + x + "is" + binnumb);
	}
	public static void main(String[] args) {
		tobinary(23);
	
	}

}
