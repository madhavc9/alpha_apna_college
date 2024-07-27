// FIBONACCI NUMBER 

package lecture;

public class L_19_5 {

	public static void main(String[] args) {
		int n =20 ;
		System.out.println(fibonacci(n));

	}
	public static int fibonacci(int n) {
		if (n==1) {
			return 1;
		}
		if (n==0) {
			return 0;
		}
		int res=fibonacci(n-1)+fibonacci(n-2);
		return res;
	}
	

}
