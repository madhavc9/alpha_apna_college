// LARGEST SUBARRAY WITH SUM 0
// O(N) ek single loop chalaya hai and baaki ka jo operation map hash wagera ka wo constant time mae
package lecture;
import java.util.*;

public class L_35_12 {

	public static void main(String[] args) {
		int arr[]= {15,-2,2,-8,1,7,10,23};
		HashMap<Integer,Integer> map=new HashMap<>();
		
		int sum=0;
		int len=0;
		for(int j=0;j<arr.length;j++) {
			sum+=arr[j];
			if(map.containsKey(sum)) {
				len=Math.max(len,j-map.get(sum));
			} else {
				map.put(sum,j);
			}
		}
		
		System.out.println("Largest Subarray with Sum 0 => " + len);

	}

}
