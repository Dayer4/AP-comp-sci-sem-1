/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
		public static void pow(int base, int exponent){
			int base2 = base;
			int i = 1;
			while(i < exponent){
				base = base * base2;
				i++;
			}
			System.out.println(base);
		}
	public static void main(String args[]) {
		pow(5,5);
		System.out.print(Math.pow(5,5));
		// Your code goes below here
	


		
	}
}
