//Largest in the array
//smallest in the array

package com.apnacollege;

public class L_8_4 {

	public static int largest(int a[]) {
		int x=Integer.MIN_VALUE;
		for (int i=0;i<a.length;i++) {
			if (a[i]>x) {
				x=a[i];
			}
		}
		return x;
	}
	
	public static int smallest(int a[]) {
		int x=Integer.MAX_VALUE;
		for (int i=0;i<a.length;i++) {
			if (a[i]<x) {
				x=a[i];
			}
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		int numbers[]= {2,4,7,5,9,6,19,13};
		int z1=largest(numbers);
		int z2=smallest(numbers);
		System.out.println("Largest among all is :" + z1);
		System.out.println("Smallest among all is :" + z2);
		
		

	}

}
