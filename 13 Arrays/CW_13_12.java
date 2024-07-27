// to check it is in asceending , descending or equal

package CW_vacation_alpha;

public class CW_13_12 {

	public static boolean order(int arr[]) {
        boolean ascending = true;
        boolean descending = true;
        boolean equal = false;
        for (int i = 0; i < arr.length - 1; i++) 
        {
            if (arr[i] > arr[i + 1]) 
            {
                ascending = false;
            } else if (arr[i] < arr[i + 1]) 
            {
                descending = false;
            }
            else if(arr[i] == arr[i+1]){
                equal = true;
            }
        } 
        return ( ascending || descending || equal);
       
    }
	public static void main(String[] args) {
		int arr[]= {4,2,0,6,3,1,5};
		int arr1[]= {2,4,6,8,9,10,12};
		int arr2[]= {9,7,5,4,0,-1,-8};
		int arr3[]= {5,5,5,5,5,5,5};

		System.out.println(order(arr));
		System.out.println(order(arr1));
		System.out.println(order(arr2));
		System.out.println(order(arr3));
	}

}
