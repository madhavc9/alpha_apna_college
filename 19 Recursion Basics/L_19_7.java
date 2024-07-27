// first occurance

package lecture;

public class L_19_7 {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7,5,1};
		int key=8;	
		int res = firstOccurance(arr,0,key);
		System.out.println(res);

	}
	
	public static int firstOccurance(int arr[],int index,int key) {
		if (arr[index]==key) {
			return index;
		}
		// base condition
		int n = arr.length-1;
		if (n==index ) {
				return -1;
			}
		return firstOccurance(arr,index+1,key);
		
	}

}
