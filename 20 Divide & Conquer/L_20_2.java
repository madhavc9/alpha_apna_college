// Quick sort Code 

package lecture;

public class L_20_2 {

	// function for printing the array
	public static void printArray(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void quicksort(int arr[],int si,int ei) {
		// base case
		if(si>=ei) {
			return;
		}
		int pIdx=partition(arr,si,ei);
		quicksort(arr,si,pIdx-1);//left part 
		quicksort(arr,pIdx+1,ei);//right part
		
	}
	
	// partition function to return the index of pivot
	public static int partition(int arr[],int si,int ei) {
		int pivot = arr[ei];
		int i =si-1;
		for (int j=si;j<ei;j++) {
			if ( arr[j]<=pivot) {
			i++;
			int temp = arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
		}
		}
		i++;
		int temp = pivot;
		arr[ei]=arr[i];
		//here pivot=arr[i] because it is variable which is value
		// call by value ... call by reference 
		// krna ye hai ki index k thru change not directly
		arr[i]=temp;
		return i;
	}
	
	public static void main(String[] args) {
		int arr[]= {6,3,9,8,2,5};
		quicksort(arr,0,arr.length-1);
		printArray(arr);

	}

}
