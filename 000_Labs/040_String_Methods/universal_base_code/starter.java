/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String name = "bob kim";
		int a = name.indexOf(" ") + 1;
		System.out.println(a);
		int b = name.length();
		System.out.println(b);
		System.out.print(name.substring(a,b));

		
	}
}
