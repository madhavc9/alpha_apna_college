//CALCULATOR

package com.apnacollege;
import java.util.*;

public class L_4_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first number :");
		int a=sc.nextInt();
		System.out.println("Input second number :");
		int b=sc.nextInt();
		System.out.println("Choose the operator :");
		System.out.println(" + for addition ");
		System.out.println(" - for subtraction ");
		System.out.println(" * for multiplication ");
		System.out.println(" / for division ");
		System.out.println(" % for remainder ");
		String op=sc.next();
		
		switch (op){
		case "+" :
			int sum=a+b;
			System.out.println(sum);
			break;
		case "-" :
			int diff=a-b;
			System.out.println(diff);
			break;
		case "*" :
			int product=a*b;
			System.out.println(product);
			break;
		case "/" :
			float division=a/b;
			System.out.println(division);
			break;
		case "%" :
			int remainder=a%b;
			System.out.println(remainder);
			break;
		default:
			System.out.println("Pls enter correct details");
		}
	}
}
