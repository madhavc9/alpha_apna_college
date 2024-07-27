//METHOD OVERLOADING
// FUNCTION OVERLOADING

package lecture;

public class L_18_8 {

	public static void main(String[] args) {
		// object create 
		calculator c1 = new calculator();
		int a = c1.sum(5, 4); 
		float b = c1.sum((float)2.5,(float)3.5);// here typecasting 
		int c = c1.sum(3, 5, 1);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	// first make a class
	
	static class calculator{
		int sum(int a , int b) {
			return a+b;
		}
		float sum(float a , float b) {
			return a+b;
		}
		int sum(int a , int b,int c) {
			return a+b+c;
		}
		
	}

}
