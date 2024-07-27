//SPIRAL 

package CW_vacation_alpha;

public class CW_15_2 {

	public static void spiralmatrix(int arr[][]) {
		int startrow =0;
		int endrow = arr.length;
		int startcol = 0;
		int endcol = arr[0].length;
		
		while (startrow <= endrow && startcol <= endcol ) {
			// top
			// here the i will be constant 
			for ( int j=startcol ; j< endcol ; j++ ) {
				System.out.print(arr[startrow][j]);
			}
			
			// right 
			for ( int i=startrow + 1 ; i< endrow ; i++ ) {
				System.out.print(arr[i][endcol]);
			}
			
			// bottom
			for ( int i=endcol - 1 ; i< endrow ; i++ ) {
				System.out.print(arr[i][endcol]);
			}			
		}
		
	}
	public static void main(String[] args) {
		int arr[][]= { 
				{1,2,3} ,
				{4,5,6} ,
				{7,8,9}
		};
		
		spiralmatrix(arr);

	}

}
