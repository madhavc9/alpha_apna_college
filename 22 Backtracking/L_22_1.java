//BACKTRACKING ON ARRAY

package lecture;

public class L_22_1 {

	// Backtracking function changearray
	public static void changeArr(int arr[],int i,int val) {
		// base case
		if (i==arr.length) {
			printArr(arr);
			// intermediate change before returning
			return;
		}
		// recursion 
		arr[i]=val;
		changeArr(arr,i+1,val+1);
		arr[i]=arr[i]-2;
		
	}
		
	// function to print the array 
	public static void printArr(int arr[]) {
		int size=arr.length;
		for (int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= new int[5];
		changeArr(arr,0,1);
		// after final change 
		printArr(arr);

	}

}
