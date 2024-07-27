//print 1 to n using while loop

package com.apnacollege;
import java.util.*;

public class L_5_1 {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int counter=1;
		System.out.println("Here is the result:");
		while(counter<=number) {
			System.out.print(counter  +  " ");
			counter++;
		}
	}
}
