//if else 
//conditional

package com.apnacollege;

public class L_4_1 {

	public static void main(String[] args) {
		int age = 22;
		if (age>18) {
			System.out.println("Eligible for vote");
		}
		else if (age>21) {
			System.out.println("Eligible for marriage");
		}
		else {
			System.out.println("bachaaaa");
		}

	}

}

/*difference b/w if if else and if else if else
if if else mai na all if condition will be checked
but in if else if .. agar ek upar wala if/elseif false tbhi neeche nahi to out of code */

/* in this code line no 13
  if hone par both eligible for vote and eligible for marriage
  else if hone par only 1st upper statement that eligible for vote */