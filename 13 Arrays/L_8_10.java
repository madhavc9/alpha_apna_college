//maximum subarray sum 
package com.apnacollege;
public class L_8_10 {
	public static void subarrays(int a[]) {
		int cur_sum=0;
		int max_sum=Integer.MIN_VALUE;
		for (int i=0;i<a.length;i++) {
		int start=i;
			for (int j=i+1;j<a.length;j++) {
				int end=j;
				int curr_sum=0;
				for (int k=start;k<=end;k++) {
					cur_sum=a[k] + cur_sum;
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