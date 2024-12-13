/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class game{
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;

	public game(){
		role = "none";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
		
	}
	public void myToString(){
		System.out.println(role);
		System.out.println(strength);
		System.out.println(dexterity);
		System.out.println(intelligence);
		System.out.println(charisma);
	}
}

