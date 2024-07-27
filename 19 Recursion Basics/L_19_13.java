// Binary String Problem 
package lecture;

public class L_19_13 {

	public static void main(String[] args) {
		printBinStrings(3,0,"");
	}
	
	public static void printBinStrings(int n , int lastPlace , String str) 
	{
		// base case
		// 0 size mae print execute ho jayega 
		if (n==0) 
		{
			System.out.println(str);
			return ; 
		}
		// kaam
		// lastplace 0/1 next place me 0 ko to add kar hi skte 
		printBinStrings(n-1,0,str+"0");
		if(lastPlace == 0)
		{
			// in case of lastplace = 0 thn additionally we can add 1 too 
			printBinStrings(n-1,1,str+"1");
		}	
	}

}
