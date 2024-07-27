// ACTIVITY SELECTION IF NOT SORTED

package lecture;
import java.util.*;
public class L_28_2 {

	public static void main(String[] args) {
		int start[]= {0,1,3,5,5,8};
		int end[]= {6,2,4,7,9,9};
		
		// for sorting creation of 2 D Array
		int activities[][]=new int[start.length][3];
		for(int i=0;i<start.length;i++) {
			activities[i][0]=i;
			activities[i][1]=start[i];
			activities[i][2]=end[i];
		}
		// lambda function using comparator for sorting 
		Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));
		 
		int maxAct=0;
		ArrayList<Integer> ans=new ArrayList<>();
		
		// 1st Activity
		maxAct=1;
		ans.add(activities[0][0]);
		int lastEnd=activities[0][2];
		for(int i=1;i<end.length;i++) {
			if(activities[i][1]>=lastEnd) {
				//activity select
				maxAct++;
				ans.add(activities[i][0]);
				lastEnd=activities[i][2];
			}
		}
		System.out.println("max activities="+maxAct);
		for(int i=0;i<ans.size();i++) {
			System.out.print("A"+ans.get(i)+" ");
		}
		System.out.println();

	}

}
