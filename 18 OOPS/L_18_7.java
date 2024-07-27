//Inheritence
// HIERARCHICAL INHERITENCE 


package lecture;

public class L_18_7 {

	public static void main(String[] args) {
		bird b1=new bird();
		b1.breathe();
		b1.color="brown";
		System.out.println(b1.color);
	}
	
	//first class banao
	// base class
	
	static class Animal
	{
		String color;
		void eat() 
		{
			System.out.println("eats");
		}
		void breathe() 
		{
			System.out.println("breathe");
		}
	}
	
	static class mammal extends Animal {
		int legs;
		void walk() {
			System.out.print("walks");
		}
	}
	
	static class bird extends Animal {
		void fly() {
			System.out.print("flys");
		}
	}
	
	static class fish extends Animal {
		void swim() {
			System.out.print("swims");
		}
	}
	
}
