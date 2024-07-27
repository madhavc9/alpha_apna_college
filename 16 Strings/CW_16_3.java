// ROUTE FINAL DISPLACEMENT

package CW_vacation_alpha;
import java.util.*;

public class CW_16_3 {

	public static float[] result (String str) {
		float x = 0;
		float y = 0;
		float n = str.length();
		for (int i = 0;i<n;i++) 
		{
			if (str.charAt(i)== 'N') 
			{
				y++;
			}
			else if (str.charAt(i)== 'S') 
			{
				y--;
			}
			else if (str.charAt(i)== 'E') 
			
			{
				x++;
			}
			else if (str.charAt(i)== 'W') {
				x--;
			}
			else 
			{
				System.out.print("INVALID DIRECTION STRING");
			}
		}
		float arr[]= {x,y};
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.print("Input the direction string without spaces :");
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		float res[]=result(str);
		double x = Math.sqrt( Math.pow(res[0],2) + Math.pow(res[1],2));
		System.out.print("The shortest distance is:"+x);
	}

}
