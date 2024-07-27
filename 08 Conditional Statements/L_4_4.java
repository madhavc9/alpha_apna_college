//largest of three numbers

package com.apnacollege;

public class L_4_4 {

	public static void main(String[] args) {
		int a=4;
		int b=7;
		int c=9;
		
		if ((a>b)&&(a>c)) {
			System.out.println("A is the largest");
		}
		else if (b>c) {
			System.out.println("B is the largest");
		}
		else {
			System.out.println("C is the largest");
		}
	}

}
