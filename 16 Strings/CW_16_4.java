// print substring

package CW_vacation_alpha;

public class CW_16_4 {
	public static void printsubstring(String str , int si , int ei) {
		String x = "";
		for (int i=si;i<ei;i++) {
			x=x+str.charAt(i);
		}
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		String str = "Hello World";
		printsubstring(str,1,5);
		System.out.print(str.substring(0,5));
	}
}
