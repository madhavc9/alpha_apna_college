//  BINARY SEARCH CODE

package CW_vacation_alpha;

public class CW_13_5 {

	public static int BinarySearch (int arr[],int n) {
		int start = 0;
		int end = arr.length-1;
	
		while (start <= end) // this one is important 
		{
			int mid = (start + end)/2; // inside while so that it can be updated 
			if (n == arr[mid]) 
			{
				return mid ;
			}
			if (n < arr[mid]) 
			{//left search
				end = mid-1;
			}
			else 
			{
				start = mid+1;
			}
		}
		return -1; // out of while loop 
	}
	public static void main(String[] args) {
		int arr[]= {2,4,6,7,8,9,11,15,17}; //ascending order 
		int key = 11;
		int index =BinarySearch(arr,key);
		if (index==-1) {
			System.out.println("NOT FOUND");
		}
		else {
			System.out.println("Found at index :" + index);
		}
	}
}
