//BINARY SEARCH

package com.apnacollege;
import java.util.*;
public class L_8_5 {	
	public static int binarysearch(int a[],int b) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if (a[mid]==b) {
				return mid;
			}
			if(a[mid]>b) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("INPUT " + size + "Elements");
		int list[]=new int[size];
		for (int i=0;i<list.length;i++) {
			list[i]=sc.nextInt();
		}
		System.out.println("Enter the key to found:");
		int key=sc.nextInt();
		int z=binarysearch(list,key);
		if(z==-1) {
			System.out.println ("NOT FOUND");
		}
		else {
			System.out.println("the key found at index : " + z );
		}
	}
}
