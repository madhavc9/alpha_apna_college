// sum of first n natural number

package lecture;

public class L_19_4 {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(findsum(n));
	}
	
	public static int findsum(int n) {
		if (n==0) {
			return 0;
		}
		int res = n+findsum(n-1);
		return res;
	}
	

}
