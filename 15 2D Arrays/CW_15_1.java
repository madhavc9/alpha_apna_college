// TAKING INPUT AND PRINTING N-D Array
// searching inside the array by making a function 
// finding min and max element 
package CW_vacation_alpha;

import java.util.*;

public class CW_15_1 {
	
	
	public static void minmax ( int arr[][]) {
		int x = Integer.MIN_VALUE;
		int y = Integer.MAX_VALUE;
		int n = arr.length;
		int m = arr[0].length ;
		
		for (int i = 0; i<n;i++) 
		{
			for ( int j=0; j<m;j++) 
			{
				if ( arr[i][j]>x) 
				{
					x=arr[i][j];
				}
				if ( arr[i][j]<y) 
				{
					y=arr[i][j];
				}
			}
		}
		System.out.println("Largest element:"+x);
		System.out.println("Smallest element:"+y);
	}
	
	public static boolean search (int arr[][] , int key ) {
		int n = arr.length;
		int m = arr[0].length ;
		for (int i = 0; i<n;i++) 
		{
			for ( int j=0; j<m;j++) 
			{
				if ( arr[i][j]==key) 
				{
	
					System.out.print("found at : " + "(" + i + ","+j + ")" );
					return true ;
				}
			}
		}
		System.out.print("not found");
		return false;
	}

	public static void main(String[] args) {
		int matrix [][] = new int [3][3];
		int n = matrix.length ;
		int m = matrix[0].length;
		
		// taking input 
	
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i<n;i++) {
			for ( int j=0; j<m;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}

		// printing 
		
		for (int i = 0; i<n;i++) 
		{
			for ( int j=0; j<m;j++) 
			{
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
		
		search(matrix,5);
		System.out.println();
		minmax(matrix);
	}

}
