//FUNCTION OVERLOADING using Data types 
// ie multiple function with same name , same function but with different types of datatypes

package com.apnacollege;

public class L_7_9 {

	
	// function to calculate sum of two integers
		public static int sum (int a , int b) {
			int z=a+b;
			return z;
		}
		
		// function to calculate sum of two float values
			public static float sum (float a , float b) {
				return a+b;
			}
		public static void main(String[] args) {
			System.out.println(sum(2,3));
			System.out.println(sum(2.4f,3.6f));
			//this above line is important 

		}


}
