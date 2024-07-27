// to find lma , rma

package CW_vacation_alpha;

public class CW_13_13 {

	public static void lma(int arr[]) {
		int size=arr.length;
		int lma[]=new int[size];
		lma[0]=arr[0];
		for (int i=1;i<size;i++) {
			lma[i]=Math.max(arr[i],lma[i-1]);
		}
		for (int i=0;i<size;i++) {
			System.out.print(lma[i]);
		}
		System.out.println();
	}
	
	public static void rma(int arr[]) {
		int size=arr.length;
		int rma[]=new int[size];
		rma[size-1]=arr[size-1];
		for (int i =size-2;i>=0;i--) {
			rma[i]=Math.max(rma[i+1],arr[i]);
		}
		for (int i=0;i<size;i++) {
			System.out.print(rma[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[]= {4,2,0,6,3,2,5};
		rma(arr);
		lma(arr);

	}

}
