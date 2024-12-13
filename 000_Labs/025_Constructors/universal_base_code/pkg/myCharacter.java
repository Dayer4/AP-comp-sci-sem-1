/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter{
	String role = "none";
	int intelligence;
	int dex;
    int charisma;
    int stre;
	public myCharacter(){
		role = "none";
		intelligence = 0;
		dex = 0;
    	charisma = 0;
    	stre = 0;
	}
	public myCharacter(String c, int a, int b, int n, int d){
		role = c;
		intelligence = a;
		dex = b;
    	charisma = n;
    	stre = d;
	}
	public void getStats(){
		System.out.println("your role is " + role);
		System.out.println("your intelligence is " + intelligence);
		System.out.println("your dexterity is " + dex);
		System.out.println("your charisma is " + charisma);
		System.out.println("your stre is " + stre);
	}
}