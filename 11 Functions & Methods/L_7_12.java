//print prime number in range
// primeinrange function banana prega
// helper function isprime()

package com.apnacollege;

public class L_7_12 {

	public static void primeinrange(int n) {
		for (int i=2;i<=n;i++) {
			if(isprime(i)==true) {
				System.out.println(i);
			}
		}
	}
	
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
		primeinrange(100);
	}

}
