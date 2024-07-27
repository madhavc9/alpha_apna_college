//BREAK 
//KEEP ENTERING NUMBER UNTILL USER ENTERS MULTIPLE OF 10
//star question

package com.apnacollege;
import java.util.*;

public class L_5_5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		do {
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n%10==0) {
			break;
		}
		}while (true);	
		System.out.println("BS HOGYA");
	}		
}
		