// INDIAN COINS 

package lecture;
import java.util.*;
public class L_28_6 {

	public static void main(String[] args) {
		// note here the array not of type int 
		// instead of Object type Integer 
		Integer coins[]= {1,2,5,10,20,50,100,500,2000};
		
		Arrays.sort(coins,Comparator.reverseOrder());
		int countofcoins=0;
		int amount=1059;
		
		ArrayList<Integer> ans=new ArrayList<>();
		
		for(int i=0;i<coins.length;i++) {
				while(coins[i]<=amount) {
					countofcoins++;
					ans.add(coins[i]);
					amount-=coins[i]; 
			}
		}
		System.out.println("total (min) coins used="+countofcoins);
		
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
		System.out.println();

	}

}
