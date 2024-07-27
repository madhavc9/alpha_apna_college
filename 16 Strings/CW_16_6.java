// STRING BUILDER 

package CW_vacation_alpha;

public class CW_16_6 {

	public static void main(String[] args) {
		StringBuilder str =new StringBuilder("");
		
		for (char ch = 'a';ch<='z';ch++) {
			str.append(ch);
		}
		System.out.println(str.length());
		System.out.print(str);
	}

}
