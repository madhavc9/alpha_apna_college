// Maximum subarray sum ( using kadane's algo )

package CW_vacation_alpha;
 
public class CW_13_11 {

	public static int kadanes(int arr[]) {
		int cs=0;
		int ms=Integer.MIN_VALUE;
		for (int i=0;i<arr.length;i++) {
			cs=cs+arr[i];
			if (cs<0) {
				cs=0;
			}
			ms=Math.max(ms,cs);
		}
		return ms;
	}
	public static void main(String[] args) {
		int num[]= {-2,-3,-4,-1,-2,-1,-5,-3};
		int res=kadanes(num);
		if (res==0) {
			int m=Integer.MIN_VALUE;
			for (int i=0;i<num.length;i++) {
				if(num[i]>m) {
					m=num[i];
				}
			res =m;
			}
		}
		System.out.println("Maximum sum is: "+res);
		
	}

}
