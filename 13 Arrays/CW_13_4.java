
/**
// LARGEST NUMBER IN AN ARRAY

package CW_vacation_alpha;
import java.util.*;

public class CW_13_4 {

	public static int linearsearch (int arr[],int n) {
		for (int i =0;i<arr.length;i++) {
			if (arr[i]==n) {
				return i;
			}
		}
		return -1;	
	} 
	
	public static int largest(int arr[]) {
		int let=Integer.MIN_VALUE;
		for (int i =0;i<arr.length;i++) {
			if (arr[i]>let) {
				let = arr[i];
			}
		}
		return linearsearch(arr,let);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of element in array :");
		int size = sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of array");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Largest element is :" +arr[largest(arr)]);
	}
}
**/



// Smallest NUMBER IN AN ARRAY

package CW_vacation_alpha;
import java.util.*;

public class CW_13_4 {

	public static int linearsearch (int arr[],int n) {
		for (int i =0;i<arr.length;i++) {
			if (arr[i]==n) {
				return i;
			}
		}
		return -1;	
	} 
	
	public static int smallest(int arr[]) {
		int let=Integer.MAX_VALUE;
		for (int i =0;i<arr.length;i++) {
			if (arr[i]<let) {
				let = arr[i];
			}
		}
		return linearsearch(arr,let);
	}
	public static void main(String[] args) {
		int arr[]= {2,3,14,19,21,34};
		int size = arr.length;
		System.out.println("Smallest element is :" +arr[smallest(arr)]);
	}
}

	