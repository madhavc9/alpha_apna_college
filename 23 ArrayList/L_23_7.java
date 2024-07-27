//CONTAINER WITH MAX WATER - 
//BRUTE FORCE USING ARRAYLIST
// 2 pointer approach

package lecture;
import java.util.*;
public class L_23_7 {

	public static int  storeWater(ArrayList<Integer> hieght) {
		int maxWater =0;
		// brute force 
		for(int i=0;i<hieght.size();i++) 
		{
			for(int j=i+1;j<hieght.size();j++) 
			{
				int ht=Math.min(hieght.get(i),hieght.get(j));
				int width=j-i;
				int currWater=ht*width;
				maxWater= Math.max(maxWater, currWater);
			}
		}
		return maxWater;
	}
	
	public static int storeWater2(ArrayList<Integer> height) {
		int maxWater=0;
		int lp=0;
		int rp=height.size()-1;
		
		while(lp<rp) {
			// calculate water area 
			int ht=Math.min(height.get(lp),height.get(rp));
			int width=rp-lp;
			int currWater=ht*width;
			maxWater=Math.max(maxWater, currWater);
			
			//update ptr
			if(height.get(lp)<height.get(rp)) {
				lp++;
			} else {
				rp--;
			}
		}
		return maxWater;
	}
	
	public static void main(String[] args) {
		// initialising the arraylist
		ArrayList<Integer> hieght = new ArrayList<>();
		//1,8,6,2,5,4,8,3
		hieght.add(1);
		hieght.add(8);
		hieght.add(6);
		hieght.add(2);
		hieght.add(5);
		hieght.add(4);
		hieght.add(8);
		hieght.add(3);
		hieght.add(7);
		System.out.println(storeWater(hieght));
		System.out.println(storeWater2(hieght));
	}

}
