// PAIR SUM - 1
// brute force O(n^2)
// optimised O(n)

package lecture;

import java.util.ArrayList;

public class L_23_8 {
	public static boolean pairSum1(ArrayList<Integer> list,int target) {
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)+list.get(j)==target) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean pairSum1opt(ArrayList<Integer> list,int target) {
		int lp=0;
		int rp=list.size()-1;
		while(lp !=  rp) {
			// case 1
			if(list.get(lp)+list.get(rp)==target) {
				return true;
			}
			// case 2
			if(list.get(lp)+list.get(rp)<target) {
				lp++;
			}
			// case 3
			else {
				rp--;
			}
			}
		return false;
	 }
	
	public static void main(String[] args) {
		// initialising the arraylist
				ArrayList<Integer> list = new ArrayList<>();
				//1,2,3,4,5,6,7,8,9
				list.add(1);
				list.add(2);
				list.add(3);
				list.add(4);
				list.add(5);
				list.add(6);
				list.add(7);
				list.add(8);
				list.add(9);
				int target=5;
				int target1=5;
				System.out.println(pairSum1(list,target));
				System.out.println(pairSum1opt(list,target1));
	}

}
