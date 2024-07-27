// trapping rain water 

package CW_vacation_alpha;
public class CW_13_14 {
		public static int Trappedwater(int arr[]) {
		int size = arr.length;
		int orderres = order(arr);
		if ((size<3) || (orderres==-1)) {
			return -1;
		}
		
		int lma[]=new int[size];
		int rma[]=new int[size];
		lma[0]=arr[0];
		rma[size-1]=arr[size-1];
		
		for (int i=1;i<size;i++) {
			lma[i]=Math.max(arr[i],lma[i-1]);
		}
		
		for (int i =size-2;i>=0;i--) {
			rma[i]=Math.max(rma[i+1],arr[i]);
		}
		
		int trapped_water=0;
		for(int i=0;i<size;i++) {
			int x=Math.min(lma[i],rma[i]);
			int y = x-arr[i];
			trapped_water=trapped_water + y ;
		}
		return trapped_water;
	}
		  public static int order(int arr[]) {
		        boolean ascending = true;
		        boolean descending = true;
		        boolean equal = false;
		        for (int i = 0; i < arr.length - 1; i++) 
		        {
		            if (arr[i] > arr[i + 1]) 
		            {
		                ascending = false;
		            } else if (arr[i] < arr[i + 1]) 
		            {
		                descending = false;
		            }
		            else if(arr[i] == arr[i+1]){
		                equal = true;
		            }
		        } 
		        boolean x = ( ascending || descending || equal);
		        if (x== true) {
		        	return -1; 
		        	}
		        return 0;
		    }

	public static void main(String[] args) {
		int arr[]= {5,9};
		int res = Trappedwater(arr);
		if (res ==-1) {
			System.out.print("NO WATER STORED");
		}
		else {
		System.out.println(res);
	}
}
}
