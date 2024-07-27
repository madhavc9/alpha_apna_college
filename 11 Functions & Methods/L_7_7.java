//binomial coffiecient 
//ncr=(n!)/(r!)(n-r)!
//here use of chunk of codes already made function (the factorial function)   

package com.apnacollege;
import java.util.*;
public class L_7_7 {
	
	
	public static float bcoeff(int n, int r) {
		int x = factorial(n);
		int y=factorial(r);
		int z=factorial((n-r));
		
		float val=(x/(y*z));
		return val;
		
	}
	public static int factorial(int a) {
		int f=1;
		for (int i=1;i<=a;i++) {
			f=f*i;
		}
		return f;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println((bcoeff(5,2)));

	}

}
