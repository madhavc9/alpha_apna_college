// CHECK IF  A GIVEN ARRAY IS SORTED OR NOT 

package lecture;

public class L_19_6 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println(issorted(arr,0));
		int arr2[]= {2,3,1,4,5};
		System.out.println(issorted(arr2,0));
	}
	
	public static boolean issorted(int arr[],int i) 
	{
		int n=arr.length-1;
		if(i==n) 
		{
			return true;
		}
		if(arr[i]>arr[i+1]) 
		{
			return false;
		}
		return issorted(arr,i+1);
	}
}
