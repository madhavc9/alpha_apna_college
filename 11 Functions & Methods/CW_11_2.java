// FUNCTION to add two numbers 


package CW_vacation_alpha;
import java.util.*;
public class CW_11_2 {
	
	public static int printsum(int num1, int num2) {
		int sum = num1+num2;
		return sum ;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter second number");
		int b =sc.nextInt();
		int sum = printsum(a,b);
		System.out.println("The sum is :" + sum);
	}
}

/*
 ek chz seekhne ko mila ki whenever function 
 int type return tb na usko print karane 
 k liye na phle usko kisi int variable mae store thn use karo
 */
