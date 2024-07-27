//OPERATORS
//a++,++a,m=+n,m+=n

package com.apnacollege;

public class L_3_1 {
	public static void main(String[] args) {
		/*
		int a=5;
		System.out.println(a);
		int c=a++;
		//yha k aage excluding this upper line a ki value will increment by 1
		System.out.println(c);
		System.out.println(a);//thtswhy yha a ki value 6 ho gyi 
		int d=++a;//on this line only a incremented by 1 ie changes ton 7
		System.out.println(d);//op - 7
		System.out.println(a);//op - 7 
		*/
		
		//m+=n means m=m+n
		//m=+n means m=n
		int m=3;
		int n=4;
		m=+n;
		m+=n;
		System.out.println(m);
		System.out.println(n);
}
}