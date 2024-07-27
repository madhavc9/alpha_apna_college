// copy constructor 
// shallow and deep copy constructor 

package lecture;

public class L_18_3 {
	public static void main(String args[]) {
		
		student s1=new student();//making up an object
		
		s1.name="madhav";
		s1.roll=3239;
		s1.Password="ranmadhav@3239";
		s1.marks[0]=100;
		s1.marks[1]=80;
		s1.marks[2]=90;
		
		student s2=new student(s1);
		
		s1.marks[2]=100;
		
		for(int i=0;i<3;i++) {
			System.out.println(s2.marks[i]);
		}
		
		s2.Password="ranmadhav@1809";
	} 
	
	// PHLE CLASS BANAO 
	// PHIR CONSTRUCTOR BANAO
	static class student {
		String name;
		int roll;
		String Password;
		int marks[];
		
		/*
		//shallow copy constructor
		student(student s1){
			this.name=name;
			this.roll=roll;
			marks=new int[3];//array to store the marks
			this.marks=s1.marks;
		}
		*/
		
		student(){
			marks=new int[3];
		}
		
		// deep copy constructor 
		student(student s1){
			this.name=name;
			this.roll=roll;
			marks=new int[3];//array to store the marks
			//this.marks=s1.marks;// yahan aise na likh kar 
			// loop chalayenge jisse new array create hoga 
			for (int i=0;i<marks.length;i++) {
				this.marks[i]=s1.marks[i];
			}
		}
		}
		
	}
	
