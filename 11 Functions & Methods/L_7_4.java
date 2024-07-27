//function to get product of two numbers 

package com.apnacollege;
import java.util.*;

public class L_7_4 {

	public static int mult (int a, int b) {
		int mul = a* b;
		return mul;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner( System.in);
//		System.out.println("Enter first number");
//		int a=sc.nextInt();
//		System.out.println("Enter second number");
//		int b=sc.nextInt();
		
		int z=mult(5,5);
		System.out.println("The product is :"+z);

	}

}
