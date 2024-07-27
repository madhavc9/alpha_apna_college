// PAIRS IN AN ARRAY
// nested loops  

package CW_vacation_alpha;

public class CW_13_7 {

	public static void pairs(int arr[]) {
		int pair =0;
		int size = arr.length-1;
		for (int i=0;i<=size;i++) {
			int n=i+1;
			for (int j=n;j<=size;j++) {
				System.out.print("( " + arr[i] + "," + arr[j] + " )");
			pair++;
			}
			System.out.println(); // this is for next line 
		}
		System.out.println("Total no of pair :" + pair);
	}
	public static void main(String[] args) {
		int arr[]= {2,4,5,7,9,11};
		pairs(arr);
	}
}
