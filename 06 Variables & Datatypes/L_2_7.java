//Type conversion
//Type casting
//Type promotion

package com.apnacollege;

public class L_2_7 {

	public static void main(String[] args) {
		
		/*
		//type conversion
		//this is possible bcz hm int ko long mai transfer ( destination type > source type )
		int a=25;
		long b=a;
		*/
		
		/*
		//type conversion
		//this is not possible bcz ( destination type < source type )
		long a=25;
		int b=a;
		System.out.println(b);
		*/
		
		/*
		//type promotion in expression
		char a='k';
		char b='a';
		int c = a - b;//here a - b ek expression hence all operand promoted into integer
		System.out.println(c);
		System.out.println(a);
		*/
		
		/*
		//eg 3
		byte a =5;
		//b=a*2;ye nhi ho payega bcz expression converted into int 
		//byte c=b*3;ye bhi nhi ho payega kyunki rhs ek integer
		int b=a*2;
		byte c=(byte)(a*3);
		System.out.println(b);
		System.out.println(c);
		*/
		
		/*
		//type casting
		float a=12.32f;
		//int b = a;this will not work 
		int b = (int)a;//this will work 
		System.out.println(b);
		*/
	}
}
