// REVERSE AN ARRAY
// Npte : Array pass as a reference 

package CW_vacation_alpha;

public class CW_13_6 {

	public static void reverse(int arr[]) {
		int start =  0;
		int end = arr.length-1;
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start ++;
			end --;		
		}
	}
	public static void main(String[] args) {
		int arr[] = {8,7,6,2,1};
		reverse(arr); //function call
		// print krwana ab 
		
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + "  ");
		}
	}
}
