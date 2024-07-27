//star pattern

/*
 this below pattern
*
**
***
****
this upper pattern
 */

package com.apnacollege;

public class L_6_1 {

	public static void main(String[] args) {
		//use of concept of nested loop 
		for(int line=1;line<=4;line++) {
			for(int star=1;star<=line;star++)
			{
				System.out.print("*");
			}
			System.out.println();
			//this println line is important otherwise same line mai execute 
		}
	
	}

}
