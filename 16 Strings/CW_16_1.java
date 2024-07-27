// String declaration
// .next and .nextLine 
// string.length()
// string concatenate
// .charAt method 
// printing all characters of a string 


package CW_vacation_alpha;
import java.util.*;

public class CW_16_1 {

	
	public static void print( String str) {
		for ( int i =0;i<str.length();i++) {
			System.out.print(str.charAt(i)+ " ");
		}
	}
	
	public static void main(String[] args) {
		
		// these 3 methods are there to declare
		
		char str [] = {'a','b','c','1','4','*'};
		String str1 = "abcd";
		System.out.println(str1);
		String str2 = new String ("abc12@#f");
		System.out.println(str2);
		
		// taking input 
		// and printing output 
		Scanner sc = new Scanner ( System.in);
		System.out.println("enter first name :");
		String str3 = sc.next();
		System.out.println(str3);
		System.out.println("enter full name :");
		Scanner sc1 = new Scanner ( System.in);
		String str4 = sc1.nextLine();
		System.out.println(str4);
		
		System.out.println(str3.length());
		
		String str5 = str3 + " " + str4 ;
		System.out.println(str5);
		
		System.out.println(str2.charAt(3));
		
		print(str3);
		
	}

}
