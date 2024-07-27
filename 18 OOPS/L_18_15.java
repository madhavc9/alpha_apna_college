// SUPER KEYWORD 
// HIERARCHY INHERITENCE 


package lecture;

public class L_18_15 {

	public static void main(String[] args) {
		Horse h = new Horse();
		Animal a1=new Animal();//with this object creation automatically constructor call and execute  
		System.out.println(h.color);
		 
	}

	static class Animal {
		String color; 
		Animal(){
			System.out.println("Animal Constructor is called");
		}
	}
	
	static class Horse extends Animal {
		Horse(){
			super.color="brown";
			//super();// earlier by default it was happening now we specially mentioning the supr keyword  
			System.out.println("Horse Constructor is called");
		}
	}
}
