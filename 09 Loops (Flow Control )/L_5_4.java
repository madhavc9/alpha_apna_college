//SUM OF 1st n natural number using for loop

package com.apnacollege;
import java.util.*;

public class L_5_4 {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int sum=0;
		int i=1;
		
		/*
		for (i=1;i<=n;i++) {
			sum=sum+i;
		}
		*/
		
		/*
		while (i<=n) {
			sum=sum+i;
			i++;
		}
		*/
		System.out.println("The final answer is: " + sum);
		

	}

}
