// recursion to print no in Ascending order

package lecture;

public class L_19_2 {

	// making our first recursive function
	public static void printinc(int n) {
		 // base case
		if (n==1) {
			System.out.print(n+" ");
			return;
		}
		//yahan aisa hua ki phle function call and thn print 
		printinc (n-1);
		System.out.print(n+ " ");
		
	}
	public static void main(String[] args) {
		int n=10;
		printinc(10);

	}

}
