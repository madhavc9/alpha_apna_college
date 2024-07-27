// SELECTION SORT

package CW_vacation_alpha;

public class CW_13_18 {

	public static void selection(int arr[]) 
	{
		int n = arr.length;
		// this outer loop for the turn and for eg 5 it runs 0 to 3
		for (int i =0;i<n-1;i++) 
		{
			int minpos=i; // sbse first wale ko mana ki ye chota isse chota agr kch ho to aage aao 
			
			for (int j=i+1;j<n;j++) // this for searching inside each iteration
			{
			 if (arr[minpos]<arr[j]) { // usko aage le aana 
				 minpos=j;
			 }
			}
			int temp=arr[i]; // mil jaane k baad swapping 
			arr[i]=arr[minpos];
			arr[minpos]=temp;
		}
	}
	
	public static void print(int arr[]) {
		int n = arr.length;
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,4,1,3,2};
		selection(arr);
		print(arr);
	}
}
