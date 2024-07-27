//INCOME TAX CALCULATOR

package com.apnacollege;
import java.util.*;
public class L_4_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your income in rupees:");
		int Salary=sc.nextInt();
		if(Salary<500000) {
			int tax=0;
			System.out.println(tax);
		}
		else if(Salary>500000 && Salary<1000000) {
			float tax=0.2f*Salary;
			System.out.println(tax);
		}
		else {
			float tax=0.3f*Salary;
			System.out.println(tax);	
		}
	} 
}
