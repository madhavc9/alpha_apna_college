//LINEAR SEARCH

package com.apnacollege;

public class L_8_3 {
	
	public static int linearsearch (int a[],int b) {
		for (int i=0;i<a.length;i++) {
			if(a[i]==b) 
			{
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int numbers[] = {23,34,21,26,78,89,14};
		int key=21;
		
		int z=linearsearch(numbers,key);
		
		if(z==-1) {
			System.out.println("NOT FOUND");
		}
		else {
			System.out.println("Found at : " + z + "th position");
		}
		
		
		
		
		}
	}

