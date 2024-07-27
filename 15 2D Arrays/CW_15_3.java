// DIAGONAL SUM

package CW_vacation_alpha;

public class CW_15_3 {

	public static int primsum(int arr[][]) {
		int x = arr.length; // no of rows  
		int sum = 0;
		for (int i=0 ; i<x ;i++) 
		{
			for (int j=0 ; j<x ;j++) 
			{
				if ( i == j || (i+j)==(x-1)) 
				{
					sum = sum + arr[i][j];
				}
			}
		}
		return sum; 
	}
	
	public static int primompsum(int arr[][]) {
		int x = arr.length;
		int sum =0;
		for ( int i=0;i<x;i++) 
		{
			sum = sum+arr[i][i];
			if (i != x-1-i) {
			sum = sum + arr[i][x-1-i];
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9},
		};
		int z = primsum(arr);
		System.out.println(z);
		System.out.print(primompsum(arr));
	}

}
