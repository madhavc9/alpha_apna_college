// MULTIPLE INHERITENCE USING INTERFACE 
/*
 HERBIVORE CLASS 
 CARNIVORE CLASS
 BEAR CLASS THAT INHERIT PROPERTY FROM BOTH HERBIVORE AND CARNIVORE
 */

package lecture;

public class L_18_13 {

	public static void main(String[] args) {
		

	}
	
	interface Herbivore{
		
	}
	
	interface Carnivore{
		
	}
	
	// comma lga kar chahe jitna chahe utne super interface ki property ko inherit kar skte   
	class Bear implements Herbivore,Carnivore {
		
	}

}
