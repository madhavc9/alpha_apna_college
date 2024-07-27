//Constructors

package lecture;

public class L_18_2 {
	
	public static void main(String args[]) {
		student s1= new student("Madhav");
		System.out.println(s1.name);
		student s2= new student(567);
		student s3= new student();

	}
	
	
	static class student { // making the class student
		String name; 
		int roll;
		
		// here below making the constructor for the class student
		student(String name){
			this.name=name;
		}
		
		student(int roll){
			this.roll=roll;
		}
		
		student(){
			System.out.println("Constructor is called");
		}
	}

}
