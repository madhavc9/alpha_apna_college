//FACTORIAL 

package com.apnacollege;
import java.util.*;
public class L_7_6 {

	
	public static int factorial(int a) {
		int f=1;
		for (int i=1;i<=a;i++) {
			f=f*i;
		}
		return f;
	}
	public static void main(String[] args) {
		//int z=factorial(5);
		System.out.println((factorial(5)));

	}

}
