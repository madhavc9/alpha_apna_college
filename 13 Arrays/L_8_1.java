//ARRAYS 
// CREATION TWO WAYS 
// I/P 
// O/P 
//IN i/p o/p it is treated as a variable 

package com.apnacollege;
import java.util.*;
public class L_8_1 {

	public static void main(String[] args) {
		int marks[]=new int[10];//one way where length specified
		char grades[]= {'A','S','B'};//another way of creating array 
		
		//assigning
		marks[0]=97;
		marks[1]=92;
		marks[2]=98;
		
		//input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3rd index marks:");
		marks[3]=sc.nextInt();
		System.out.println("Enter 4th index marks:");
		marks[4]=sc.nextInt();
		System.out.println("Enter 5th index marks:");
		marks[5]=sc.nextInt();
		
		//output 
		System.out.println("AT:"  + marks[4]  + "madhav got : "  + grades[1]);
		System.out.println("AT:"  + marks[0]  + "madhav got : "  + grades[0]);
		
	}

}
