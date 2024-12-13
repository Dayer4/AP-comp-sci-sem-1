/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below heremyCharacter bob = new myCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("gimme a role");
		String role = sc.nextLine();
		if(role.equals("Wizard")||role.equals("wizard")||role.equals("Rogue")||role.equals("rogue")||role.equals("Warrior")||role.equals("warrior")){
			myCharacter bob2 = new myCharacter(role,1,1,1,1);
			bob2.getStats();
		}else{
			myCharacter bob = new myCharacter();
			bob.getStats();
		}
	}
}
