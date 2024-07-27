// print subarrays 
// sum of each subarray
// maximum sum of among all subarray
// minimum sum among all subarray
// total number of subarray count

package CW_vacation_alpha;

public class CW_13_8 {

	public static void subarrays(int arr[]) {
	int ts=0;
	int num1 = Integer.MIN_VALUE;
	int num2 = Integer.MAX_VALUE;
	for (int i=0;i<=arr.length-1;i++) 
	{
		for (int j = i;j<=arr.length-1 ;j++) 
		{
			int arsum =0;
			System.out.print("[");
			for (int x =i; x<=j;x++) 
			{
				System.out.print(arr[x]+" ");
				arsum = arsum +arr[x];
				
			}
			System.out.print("]");
			ts++;
			System.out.println("  SUM : ->" + arsum);
			if (arsum>num1) {
				num1=arsum;
			}
			if (arsum<num2) {
				num2=arsum;
			}
		}
		
	}
	System.out.println("Maximum sum :" + num1);
	System.out.println("Minimum sum :" + num2);
	System.out.println("Total subarray count :"+ts);
	}
	public static void main(String[] args) {
		int arr[]= {2,4,1,2,-4};
		subarrays(arr);
	}

}
