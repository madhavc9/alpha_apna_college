// FUNCTION OVERRIDING
// here actually parent and child both contain the same function
// but with different definition so in that case overriding takes place
// so child waale ka consider kiya jayega 



package lecture;

public class L_18_9 {

	public static void main(String[] args) {
		deer d1= new deer();
		d1.eats();

	}
	
	static class Animal {
		void eats() {
			System.out.println("Eats Anything");
		}
	}
	
	static  class deer extends Animal {
		void eats() {
			System.out.println("Eats grass");
		}
	}

}
