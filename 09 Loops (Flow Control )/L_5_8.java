//Continue
//display all numbers entered by users except 10

package com.apnacollege;
import java.util.*;

public class L_5_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
		System.out.print("Enter your number:");
		int n=sc.nextInt();
		if(n%10==0) {
			continue;
		}
		System.out.println(n);
		}while(true);
	}

}
