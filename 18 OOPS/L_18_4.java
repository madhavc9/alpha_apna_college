//Inheritence
// single level inheritence 

package lecture;

public class L_18_4 {

	public static void main(String[] args) {
		// main function k andar object banana
		fish Shark = new fish();
		Shark.eat();
		// fish ka khud ka apna nahi hai eat function
		// but it derives from the animal 

	}
	
	//first class banao
	// base class
	
	static class Animal
	{
		String color;//properties
		// function :- eat,breathe
		void eat() 
		{
			System.out.println("eats");
		}
		void breathe() 
		{
			System.out.println("breathe s");
		}
	}
	
	static class fish extends Animal {
		int fins;//additional attribute
		// this is additional function of fish class
		void swim() {
			System.out.println("swims in water");
		}
	}

}
