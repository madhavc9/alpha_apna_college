// Grid Ways 

package lecture;

public class L_22_5 {

	// function to calculate gridways 
	public static int gridWays(int i , int j , int m , int n) {
		// base case 
		if (i==n-1 && j==m-1) {
			return 1;
		}
		else if (i>=n || j>=m ) {
			return 0;
		}
		// recursive call 
		int w1 = gridWays(i+1,j,m,n);
		int w2 = gridWays(i,j+1,m,n);
		return (w1+w2);
	}
	
	public static void main(String[] args) {
		int n=3, m=3;
		System.out.print(gridWays(0,0,n,m));
		

	}

}
