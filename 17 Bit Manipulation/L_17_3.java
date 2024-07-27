// GET SET CLEAR ith bit
// update ith bit (number, position , set/clear)
// ( number , position , if 1 thn 0 , if 0 thn 1 )
// clear last i bits
// clear range of bits 
// check number is power of 2 or not 
// count set bits in a number 
// fast exponentiation

package lecture;
import java.util.*;

public class L_17_3 {

	public static int getbit(int n , int pos ) {
		int bitmask=(1 <<pos);
		int res=bitmask&n;
		if(res==0) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public static void setbit(int n , int pos ) {
		int bitmask=(1<<pos);
		int res=bitmask|n;
		System.out.println(res);
		
	}
	public static void clearbit(int n , int pos ) {
		int bitmask = ~(1<<pos);
		int res=bitmask&n;
		System.out.println(res);
		
	}
	
	public static void clearlast(int n , int noofbits) {
		int bitmask = (~0<<noofbits);
		System.out.println(n&bitmask);
	}
	
	public static void updatebit(int n ,int pos , int newBit ) {
		if(newBit==0) {
			clearbit(n,pos);
		}
		else if (newBit==1){
			setbit(n,pos);
		}
	}
	
	public static void changebit(int n , int pos) {
		int n1 = getbit(n,pos);
		if (n1==0) {
			setbit(n,pos);
		}
		else if (n1==1) {
			clearbit(n,pos);
		}
	}
	
	public static void clearrangeofbits (int n , int i ,int j) {
//		int bitmask1=2^(i-1)-1; 
		int bitmask1=(1<<i)-1;
		int bitmask2=((~0)<<(j+1));
		int bitmask = bitmask1 | bitmask2 ;
		System.out.println(n & bitmask ); 
	}
	
	public static void powerof2(int n) {
		if ((n&n-1)==0) {
			System.out.println("yes it is");
		}
		else {
			System.out.println("nopes");
		}
	}
	
	public static void checksetbits(int n) {
		int count =0;
		while(n>0) 
		{
			int x=(n&1);
			if (x==1) 
			{
				count++;
			}	
			n=n>>1; 
		}
		System.out.println(count);
		
	}
	
	public static int fastexpo (int n,int p) {
		int ans=1;
		while(p>0) {
			if((p&1) != 0) {
				ans=ans*n;
			}
			n=n*n;
			p=p>>1;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		System.out.println(getbit(10,2));//0
		System.out.println(getbit(10,3));//1
		setbit(10,2);//14
		setbit(10,1);//10
		clearbit(10,2);//10
		clearbit(10,1);//8
		updatebit(10,1,0);//8
		updatebit(10,1,1);//10
		changebit(10,1);//8
		changebit(10,2);//14
		clearlast(10,2);//8
		clearlast(11,2);//8
		clearlast(12,2);//12
		clearrangeofbits(11,1,2);//9 
		powerof2(16);// yes it is
		powerof2(15);//nopes
		checksetbits(10);
		checksetbits(11);
		checksetbits(15);
		checksetbits(16);
		System.out.println(fastexpo(2,3));
	}

}
