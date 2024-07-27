// maximum subarray sum using prefix sum


package CW_vacation_alpha;

public class CW_13_10 {

	public static void maxSum(int arr[]){
		int maxsum=Integer.MIN_VALUE;
		int cursum=0;
		int newarr[]=new int[arr.length]; //creating prefix array
		newarr[0]=arr[0]; 
		for (int i=1;i<=arr.length-1;i++) 
		{
			newarr[i]=newarr[i-1]+arr[i];
		}
		
		// calculating sum 
		for (int i=0;i<=arr.length-1;i++) 
		{
			for (int j = i;j<=arr.length-1 ;j++) 
			{
				if (i==0) {
					cursum=arr[0];
				}
				else {
				cursum =newarr[j]-newarr[i-1];
			}
			if (cursum>maxsum) {
				maxsum=cursum;
			}
		}
		}
		System.out.println(maxsum);
	}
	public static void main(String[] args) {
		int arr[]= {1,-2,6,-1,3};
		maxSum(arr);
	}

}
