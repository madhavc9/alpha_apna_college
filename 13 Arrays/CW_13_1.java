// AVG OF marks using array

package CW_vacation_alpha;
import java.util.*;
public class CW_13_1 {

	public static void main(String[] args) {
		// array define 
		
		int marks[]= new int[10];
		System.out.println("size of array: " + marks.length); 
		// dot function for finding size of array
		
		//taking input using scanner class and importing util
		Scanner sc = new Scanner ( System.in);
		System.out.println("Input marks of PCM :");
		// yha ye important ki marks[0] is treated as variable of int type 
		marks[0]=sc.nextInt();
		marks[1]=sc.nextInt();
		marks[2]=sc.nextInt();
		
		int average = (marks[0]+marks[1]+marks[2])/3;
		System.out.println("AVERAGE :" + average);
	}

}
