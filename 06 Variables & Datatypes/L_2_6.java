//taking input from user
//product of two no 
//area of circle 

/*
import java.util.*;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
*/

//these three lines very important for taking input 
//1st line importing the package where scanner class has already made
//2nd line creating new object of scanner class ( name given sc)
//3rd line using sc.next function and storing into a variable of int datatype

package com.apnacollege;
import java.util.*;
public class L_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//product of two no 
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st no:");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd no:");
		int b=sc.nextInt();
		int product=a*b;
		System.out.println("The product is:" + product);
		*/
		
		//area of circle 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the radius :");
		int radius=sc.nextInt();
		
		//float area=3.14*radius*radius;
		//this line will give error bcz java 3.14 ko double smjh rha 
		//thtswhy 3.14 ki jagah 3.14f use krna hga 
		float area=3.14f*radius*radius;
		System.out.println("The area is:"+area);
		
		
	}

}
