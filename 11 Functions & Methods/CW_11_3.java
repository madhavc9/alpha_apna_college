// Swapping using a function with parameter passing 


package CW_vacation_alpha;

public class CW_11_3 {

	public static void swap ( int num1 , int num2) {
		int temp ; 
		temp = num1 ; // num1 ki value temp mae daalna 
		num1 = num2 ; // num2 ki value num1 mae daalna 
		num2 = temp ; // temp ki value num2 mae daalna 
		System.out.println("swap fn:" + num1);
		System.out.println("swap fn:" + num2);
		
	}
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		swap (a,b);
		System.out.println("main fn:" + a);
		System.out.println("main fn:" + b);
	}

}
