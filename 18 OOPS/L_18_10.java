// abstract class 

package lecture;

public class L_18_10 {

	public static void main(String[] args) {
		// making up of an object 
		Horse h1=new Horse();
		h1.eat();
		h1.walk();
		Chicken ch1=new Chicken();
		ch1.eat();
		ch1.walk();
		// Animal a1=new Animal(); // see animal class ka object nahi bana skte ie instantiate nahi kar skte 
		

	}
	
	// making up an abstract class 
	static abstract class Animal {
		String color;
		
		// making of a constructor inside the abstract class
		Animal(){
			color="brown"; // by default yahi rhega ye color change nahi hoga 
			
		}
		
		// inside abstract class :> 
		// abstract method / non abstract method both can be there 
		void eat() { //non abstract method 
			System.out.println("eats");
		}
		abstract void walk();// in abstract function no implementation
		// no implementation we have mentioned just idea and now it depends upon the  subclass of animal  
	}
	
	// making of subclass using inheritence
	
	static class Horse extends Animal {
		void walk() {
			System.out.println("Walks on 4 legs");
		}
		void changecolor() {
			color="dark brown";
		}
	}
	
	static class Chicken extends Animal {
		void walk() {
			System.out.println("Walks on 2 legs");
		}
	}
}
