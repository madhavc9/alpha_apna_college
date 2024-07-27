//Inheritence
// multi level inheritence 

package lecture;

public class L_18_6 {

	public static void main(String[] args) {
		dogs oreo=new dogs();
		oreo.eat();
		oreo.legs=2;
		System.out.println(oreo.legs);
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
			System.out.println("breathe s");
		}
	}
	
	static class mammal extends Animal {
		int legs;
	}
	static class dogs extends mammal {
		String breed;
	}
}
