// function overloading wrto the datatypes of the parameter

package CW_vacation_alpha;

public class CW_11_8 {

	// func to calculate integer sum
	public static int sum (int a,int b) {
		return a+b;
	}
	
	// func to calculate float sum
	public static float sum (float a,float b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(sum(2,3));
		System.out.println(sum(2.8f,3.7f));
	}

}
