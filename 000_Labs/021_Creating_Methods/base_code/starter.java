/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void etring(){
		Scanner sc = new Scanner(System.in);
		System.out.println("gimme a sentence");
		String a = sc.nextLine();
		System.out.print(a);
	}
	public static String toStringCombined(){
		Scanner sc = new Scanner(System.in);
		System.out.println("gimme a sentence");
		String a = sc.nextLine();
		System.out.println("gimme another sentence");
		String b = sc.nextLine();
		return a + " " + b;
	}
	public static void main(String args[]) {
		toStringCombined();
	}
}
