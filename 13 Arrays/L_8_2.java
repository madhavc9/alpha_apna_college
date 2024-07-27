//ARRAY CALL BY REFERENCE 
// ie variable ko kisi dusre function mai as a parameter send krne par kch changes agar krte hain to wo main function mai bhi change ho jayega


package com.apnacollege;

public class L_8_2 {
	
	public static void update(int marks[]) {
		for (int i=0;i<marks.length;i++) {
			marks[i]=marks[i]+1;
		}
		
	}

	public static void main(String[] args) {
		int marks[]= {93,94,98,99};
		
		
		//this line is very important to remember 
		update(marks);
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
	}

}
