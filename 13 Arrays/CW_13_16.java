// MAXIMUM DIFFERENCE BETWEEN TWO ELEMENTS 
// see this is my opwn code but it has O(Nsquare) time complexity
// and isme if we wanna find the for which pair thn wo kaise ?
// thru chatgpt nice idea to create 

package CW_vacation_alpha;

public class CW_13_16 {

	public static int maxdiff(int arr[]) {
		int min=Integer.MIN_VALUE;
		int size = arr.length;
		int result[] = new int[2]; // Store the indices of the pair
		for (int i=0;i<size;i++) 
		{
			for (int j=i+1;j<size;j++) 
			{
				int x=arr[j]-arr[i];
				if (x>min) 
				{
					min = x;
				}	
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int arr[]= {7,1,5,3,6,4};
		System.out.println("Then max profit will be :" + maxdiff(arr));
		
	}

}
