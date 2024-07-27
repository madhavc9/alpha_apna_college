//OPTIMISED WAYY TO REVERSE THE STRING

package com.apnacollege;

public class L_8_7 {

	
	public static void reverse(int a[]) {
		int first=0, last= a.length-1;
		while(first<last) {
			int temp=a[last];
			a[last]=a[first];
			a[first]=temp;
			first++;
			last--;
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print( "\t"  + arr[i] );
		}
	}
}
