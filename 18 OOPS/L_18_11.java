// constructer call in abstract class
// Animal -> Horse -> Mustang


package lecture;

public class L_18_11 {

	public static void main(String[] args) {
		Mustang m1=new Mustang();
		// yahan ek object banaye m1 
		// ab isse hi constructer call ho jayega 
		// sbse phle Animal thn Horse thn Mustang 
		Horse h1=new Horse();
		System.out.println(h1.color);// here by default color = brown by default it was brown
		h1.changecolor();// here change color function
		System.out.println(h1.color);// here changed color will be printed 
		
	}
	
	static abstract class Animal {
		String color;
		Animal(){
			color="brown"; 
			System.out.println("Animal constructer called");
		}
		void eat() { //non abstract method 
			System.out.println("eats");
		}
		abstract void walk();
		}
	
	
	static class Horse extends Animal {
		Horse(){
			System.out.println("Horse constructer called");
		}
		void walk() {
			System.out.println("Walks on 4 legs");
		}
		void changecolor() {
			color="dark brown";
		}
	}
	
	static class Mustang extends Horse {
		Mustang(){
			System.out.println("Mustang constructer called");
		}
		void walk() {
			System.out.println("Walks on 2 legs");
		}
	}
}
