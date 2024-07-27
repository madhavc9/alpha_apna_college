// Majority Element 

package lecture;
import java.util.*;
public class L_35_4 {

	public static void main(String[] args) {
		int arr[]= {1,3,2,5,1,3,1,5,1};
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			/*
			if(map.containsKey(arr[i])) 
			{
				map.put(arr[i],map.get(arr[i])+1);
			} else 
			{
				map.put(arr[i],1);
			}
			*/
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		Set <Integer> keySet = map.keySet(); 
		for(Integer key: keySet) {
			// note yahan direct
			// for(Integer key: map.keySet) {
			// bhi likh sakte
			if(map.get(key)>arr.length/3) {
				System.out.println(key);
			}
		}

	}

}
