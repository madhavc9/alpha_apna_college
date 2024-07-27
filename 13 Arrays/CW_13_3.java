// Linear Search

package CW_vacation_alpha;

public class CW_13_3 {

	public static int linearsearch (int arr[],int n) {
		for (int i =0;i<arr.length;i++) {
			if (arr[i]==n) {
				return i;
			}
		}
		return -1;	
	}
	
	public static void main(String[] args) {
		int num[]= {2,4,5,7,9,10,23};
		int key1 = 10;
		int key2 = 29;
		
		int res = linearsearch(num,key2);
		if (res == -1) {
			System.out.println("Not Found");
		}
		else {
			System.out.println("Found at index : " + res );
		}

	}

}
