// REMOVE DUPLICATE FROM A STRING 

package lecture;

public class L_19_11 {

	public static void main(String[] args) {
		String str = "appnnacollege";
		removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);

	}
	public static void removeDuplicates(String str,int idx, StringBuilder newStr,boolean map[]) {
		// base condition
		if(idx==str.length()) {
			System.out.println(newStr);
			return;
		}
		// kaam 
		char currChar=str.charAt(idx);
		// check if there in hashmap
		if (map[currChar-'a']==true) {
			removeDuplicates(str,idx+1, newStr,map);
		}
		else {
			map[currChar-'a']=true;
			removeDuplicates(str,idx+1,newStr.append(currChar),map);
		}
	}

}
