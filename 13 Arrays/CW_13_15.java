// BUY AND SELL STOCK in mam's way 

package CW_vacation_alpha;

public class CW_13_15 {

	public static int maxprof(int arr[]) {
		int buyprice = arr[0];
		int maxprofit = 0;
		int size =arr.length;
		for ( int i=0;i<size;i++) {
			if(buyprice < arr[i]) {
				int profit = arr[i]-buyprice; //todays profit
				maxprofit = Math.max(maxprofit, profit);
			}
			else {
				buyprice =arr[i]; // acha phle yha aayega thn continue 
			}
		}
		return maxprofit ;
	}
	public static void main(String[] args) {
		int price[]= {7,1,5,3,6,4};
		System.out.println(maxprof(price));

	}
}
