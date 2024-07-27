// PRINT X^N - normal
// PRINT X^N - Optimised 

package lecture;

public class L_19_9 {

	public static void main(String[] args) {
		int num = 2;
		int pow = 5;
		System.out.println(printxn(2,10));
		System.out.println(powoptimised(2,10));
	}
	
	public static int powoptimised ( int x , int n) 
	{
		// base condition 
		if (n==1) {
			return x;
		}
		// recursive function 
		int z=powoptimised (x ,(n/2));
		// computation 
		int res = z*z;
		if (n%2==1) 
		{
			res=res*x;
		}
		return res;
		
	}
	
	public static int printxn(int x , int n){
		if (n==1) {
			return x;
		}
		int y = printxn(x,n-1);
		int res = x*y;
		return res;
		
	}

}
