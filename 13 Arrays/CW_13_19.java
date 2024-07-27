// INSERTION SORT

package CW_vacation_alpha;

public class CW_13_19 {

	public static void insertion(int arr[]) 
	{
		int n = arr.length;
		for (int i =0;i<=n-2;i++) 
		{
			int swap=0;
			for (int j=0;j<=n-2-i;j++) 
			{
				if (arr[j]>arr[j+1]) 
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap++;
				}
			}
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
		insertion(arr);
		print(arr);
	}
}

