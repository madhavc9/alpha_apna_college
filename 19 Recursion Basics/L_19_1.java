// recursion to print no in descending order

package lecture;

public class L_19_1 {

	// making our first recursive function
	public static void printdec(int n) {
		 // base case
		if (n==1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printdec(n-1);
	}
	public static void main(String[] args) {
		int n=10;
		printdec(10);

	}

}
