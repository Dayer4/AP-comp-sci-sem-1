/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;
class character{
	String role = new String("Wizard");
	int Strength = 10;
	int Dexterity = 10;
	int Int = 10;
	int Rizz = 10;
}
class starter {
	public static void main(String args[]) {
		// Your code goes below here
		character Bob = new character();
		System.out.println(Bob);
		System.out.println(Bob.Strength);
		System.out.println(Bob.Dexterity);
		System.out.println(Bob.Int);
		System.out.println(Bob.Rizz);
	}
}
