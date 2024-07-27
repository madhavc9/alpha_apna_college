// STATIC KEYWORD

package lecture;

public class L_18_14 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.schoolName="JMV"; 
		Student s2=new Student();
		System.out.println(s2.schoolName);
		// here for student s2 we did not defined but as schoolName under static so class k all object k liye automatically assign
		Student s3 = new Student();
		s3.schoolName="kv";
		System.out.println(s2.schoolName);
	}
	
	static class Student{
		static int returnPercentage(int math,int phy,int chem) {
			return (math+phy+chem)/3;
		}
		
		String name;
		int roll;
		
		static String schoolName;
		
		String getName() { 
			return this.name;
		}
		
		void setName(String name) {
			this.name=name;
		}
		
		
	}

}
