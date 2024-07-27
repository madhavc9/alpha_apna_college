//REVERSING elements of array 2 ways
package com.apnacollege;
public class L_8_6 {
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
		int newarr[]=new int[arr.length];
		
		for (int j=arr.length-1;j>=0;j--) {
			newarr[arr.length-j-1]=arr[j];	
		}
		for (int j=0;j<newarr.length;j++) {
			System.out.print(newarr[j] + " ");
		}
	}
}


