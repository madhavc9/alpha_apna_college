//OOPS Lecture 1 

package lecture;

public class L_18_1 {

	public static void main(String[] args) {
		Pen p1 = new Pen();// created a pen object called p1
		p1.setColor(" Blue");
		System.out.println(p1.color);//accessing the property of the object using dot operator
		p1.settip(5);//calling the function for object p1
		System.out.println(p1.tip);
		p1.color="yellow"; // changing the attribute of object using assignment operator because this is by default DEFAULT
		System.out.println(p1.color);
		
		Bankaccount A1 = new Bankaccount();
		//A1.password="abcd";//this password is private so can't assign 
		A1.username="ranmadhav";
		//String s=A1.password;//not visible because private
		 A1.changepassword("xyz");
		 System.out.println(A1.username);
		 //System.out.println("A1.password");
	}

}

class Bankaccount{
	public String username;//note: this username attribute is public 
	private String password;// this password attribute is private 
	// this changepassword function is public
	public void changepassword(String newpwd) {
		password=newpwd;
	}
	
}

// making the class pen with some attributes and functions
class Pen{
	int tip;
	String color;
	
	void settip (int newTip) {
		tip=newTip;

	}
	
	void setColor(String newColor) {
		color =newColor;
	}
}
