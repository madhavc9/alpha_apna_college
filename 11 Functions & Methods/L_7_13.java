//BINARY TO DECIMAL CONVERTER FUNCTION


package com.apnacollege;

public class L_7_13 {

	public static int decvalue(int binnumb) {
		int mynumb=binnumb;
		int pow=0;
		int decimal=0;
		while(binnumb >0){
			int lastdigit=binnumb%10;
			decimal=decimal+(lastdigit *(int)Math.pow(2,pow));
			pow++;
			binnumb=binnumb/10;
		}
		return decimal;
	}
	
	public static void main(String[] args) {
		
		int n=1110;
		int z=decvalue(n);
		System.out.println("the decimal value for" + n +  "is"  + z);
		
	}
}
