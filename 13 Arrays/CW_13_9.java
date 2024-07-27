// Maximum subarray sum - brute force

package CW_vacation_alpha;

public class CW_13_9 {

	public static void maxsubarrays(int arr[]) {
		int maxSum = Integer.MIN_VALUE;
		for (int i=0;i<=arr.length-1;i++) 
		{
			for (int j = i;j<=arr.length-1 ;j++) 
			{
				int cursum =0;
				for (int x =i; x<=j;x++) 
				{
					cursum = cursum +arr[x];	
				}
				System.out.println(cursum);
				if (cursum>maxSum) {
					maxSum=cursum;
				}
			}
			
		}
		System.out.println("Maximum sum :" + maxSum);
		}
		public static void main(String[] args) {
			int arr[]= {1,-2,6,-1,3};
			maxsubarrays(arr);
		}

	}
