// LARGEST BASED ON LEXICAL ORDER

package CW_vacation_alpha;

public class CW_16_5 {

	public static void largest(String x[]) {
		int n = x.length;
		String largest = x[0];
		for ( int i =1;i<n;i++) {
			if (x[i].compareToIgnoreCase(largest)>0) {
				largest =x[i];
			}
		}
		System.out.print(largest);
	}
	public static void main(String[] args) {
		String str[]= {"apple","mango","banana"};
		largest(str);

	}

}
