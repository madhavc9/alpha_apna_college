//function overloading with number of parameter

package com.apnacollege;

public class L_7_8 {

	
	// function to calculate sum of two integers ( ie taking 2 parameters)
	public static int sum (int a , int b) {
		int z=a+b;
		return z;
	}
	
	// function to calculate sum of three integers ( ie taking 3 parameters)
		public static int sum (int a , int b,int c) {
			return a+b+c;
		}
	public static void main(String[] args) {
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,4));

	}

}
