// Function overloading with respect to number of parameters 
// so here we verified function overloading wrto number of parameters 
package CW_vacation_alpha;

public class CW_11_7 {

	public static int sum (int a , int b) {
		return(a+b);
	}
	public static int sum (int a , int b , int c) {
		return(a+b+c);
	}

	public static void main(String[] args) {
		int x= sum(2,3);
		System.out.println(x);
		int y = sum(3,5,7);
		System.out.println(y);
	}

}
