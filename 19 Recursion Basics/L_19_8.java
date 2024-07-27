// last occurance

package lecture;

public class L_19_8 {

	public static void main(String[] args) {
		int arr[]= {2,4,5,6,7,5,1};
		int key=5;	
		int arr2[]= {5,5,5,5};
		int res = lastOccurance(arr2,0,key);
		System.out.println(res);

	}
	
	public static int lastOccurance(int arr[],int index,int key) {
		// base condition 
		// ki pura traverse kar gya nahi mila kahin to return -1 
		if (index == arr.length) {
			return -1;
		} 
		int n2 = lastOccurance(arr,index+1,key); // aage mila kahin thn return index ya nahi mila ( got -1 )
		if (n2 == -1 && arr[index]==key ) { //aage nahi mila and current has it thn return current index 
			return index;
		}

		return n2;
	}

}
