// array vs number passing as an argument 

package CW_vacation_alpha;

public class CW_13_2 {

	public static void change (int arr[],int n) {
		n = n+1 ;
		for (int i =0 ;i<arr.length;i++) {
			arr[i]=arr[i]+1;
		}
	}
	
	public static void main(String[] args) {
		int marks[]= {92,95,96};
		int num = 49;
		System.out.println("Before :");
		for (int i =0;i<marks.length;i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println(num);
		
		change (marks,num); 
		
		System.out.println("After :");
		for (int i =0;i<marks.length;i++) {
			System.out.print(marks[i] + " ");
		}
		System.out.println(num);
	}

}

// so the conclusion is ki arrays change ho gye lekin variable nahi after passing the parameter
// reason being ki array pass by reference ie ( original pass ho jaata )
// and variable k time pass by value ie copy pass hoti 