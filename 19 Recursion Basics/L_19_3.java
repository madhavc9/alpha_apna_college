// FACTORIAL OF A NUMBER 

package lecture;

public class L_19_3 {

	public static void main(String[] args) {
		int n=5;
		System.out.println(factorial(n));

	}
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		int res = n*factorial(n-1);
		return res;
	}

}
