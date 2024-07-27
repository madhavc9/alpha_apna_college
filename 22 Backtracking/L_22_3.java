// FIND PERMUTATION 

package lecture;

public class L_22_3 {

	// FIND PERMUTATION FUNCTION
	
	public static void findPermutation(String str , String ans) {
		// base case
		if (str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		// recursion
		for (int i=0;i<str.length();i++) {
			char curr=str.charAt(i);
			//"abcde"=> "ab"+"de" => "abde"
			// usko hatane k liye substring function ka use kiya gya string ka 
			String Newstr=str.substring(0,i)+str.substring(i+1);
			findPermutation(Newstr,ans+curr);
		}
	}
	public static void main(String[] args) {
		String str ="abc";
		findPermutation(str,"");
	}
}
