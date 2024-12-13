/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("gimme a name");
	String name = sc.nextLine();
	System.out.println("Gimme a number");
	int b = sc.nextInt();
	int a = 0;
	while (a != b + 1){
		System.out.println(name);
		a = a + 1;
	}
		
	}
}
