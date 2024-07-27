// Mountain Ranges


package lecture;

public class L_47_4 {

	public static int mountainRanges(int n) {
		 int dp[]=new int[n+1];
		 dp[0]=1;
		 dp[1]=1;
		 
		 for(int i=2;i<=n;i++) {
			 // for i pairs ---> how many mountain ranges possible 
			 for(int j=0;j<i;j++) {
				 int inside_arrange=dp[j];
				 int outside_range=dp[i-j-1];
				 dp[i]+=inside_arrange*outside_range;
			 }
		 }
		 return dp[n];
	}
	
	public static void main(String[] args) {
		int n=4;
		System.out.println(mountainRanges(4));

	}
}
