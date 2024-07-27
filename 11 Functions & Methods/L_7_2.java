//function to add two integer

package com.apnacollege;
import java.util.*;
public class L_7_2 {

	public static int sum (int a , int b) {
		int sum =a+b;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int z=sum(a,b);
		System.out.println(z);
	}
}
