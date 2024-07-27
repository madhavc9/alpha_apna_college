// MERGE SORT DIVIDE AND CONQUER 

package lecture;

public class L_20_1 {

	// main function
	public static void main(String[] args) {
		int arr[]= {6,3,9,5,2,8};
		mergeSort(arr,0,arr.length-1);
		printArr(arr);
	}
	
	// recursive function
	public static void mergeSort(int arr[],int si, int ei) {
		// base case 
		if (si>=ei) {
			return;
		}
		
		// kaam
		int mid=si+((ei-si)/2);
		mergeSort( arr,si,mid);
		mergeSort( arr,mid+1, ei);
		merge(arr,si,mid,ei);
		 
	}
	
	// merge karna 
	public static void merge(int arr[],int si,int mid, int ei) {
		// temporary array
		int temparraysize=ei-si+1;
		int temp[]=new int[temparraysize];
		int i = si; // iterator for left part
		int j = mid+1; // iterator for right part
		int k = 0; // interator of temp array
		while (i<=mid && j<=ei) {
			if (arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;
			}
			else {
				temp[k]=arr[j];
				j++;
			}
			k++;
		}
		// in left some left over part
		while (i<=mid) {
			temp[k++]=arr[i++];
		}
		// in right some left over part
				while (j<=ei) {
					temp[k++]=arr[j++];
				}
		// copy temp to original arr
		for (k=0,i=si;k<temp.length;k++,i++) {
			arr[i]=temp[k];
		}
		
	}
	
	// function for printing the array
	public static void printArr(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

} 
