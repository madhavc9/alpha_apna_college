// to check weather a number is prime or not 

package com.apnacollege;

public class L_7_10 {

	public static boolean isPrime(int n) {
		/*
		boolean isPrime=true;
		for (int i=2;i<=n;i++) {
			if(n%i==0) {
				isPrime=false;
			}
			break;
		}
		return isPrime;*/
		
		for (int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPrime(17));

	}

}
