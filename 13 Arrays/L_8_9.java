//PRINT SUBARRAYS OF AN ARRAY
package com.apnacollege;
public class L_8_9 {
	public static void subarrays(int a[]) {
		for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);
			for (int j=i+1;j<a.length;j++) {
				for (int k=i;k<=j;k++) {
					System.out.print(a[k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,7,8,9};
		subarrays(arr);
	}
}
