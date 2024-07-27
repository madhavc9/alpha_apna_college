//optimised way to print prime (04:45)
//use of math function here


package com.apnacollege;

public class L_7_11 {

	
	public static boolean isprime(int n) {
		boolean prime=true;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if (n%i==0) {
				prime=false;
			}
		}
		return prime;
	}
	public static void main(String[] args) {
		System.out.println((isprime(8)));

	}

}
