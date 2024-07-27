//tiling problem 
// here given 2*n floor , also each tile size 2*1

package lecture;

public class L_19_10 {

	public static void main(String[] args) {
		System.out.println(tilingprob(7));
	}
	
	public static int tilingprob(int n) {
		// base condition 
		if (n==1 || n==0) {
			return 1;
		}
		/*
		// horizontal
		int fnm2=tilingprob(n-2);
		// vertical
		int fnm1=tilingprob(n-1);
		
		int total_ways = fnm2+fnm1;
		
		
		return total_ways;
		*/
		
		return tilingprob(n-2)+tilingprob(n-1);
	}

}
