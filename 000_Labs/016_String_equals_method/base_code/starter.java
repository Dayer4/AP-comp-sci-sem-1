/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to be a Wizard, Warrior, or Rogue");
		String role = sc.nextLine();
		if (role.equals("Wizard") || role.equals("wizard")) {
			System.out.print("Ur a wizard!");
		}
		else if(role.equals("warrior") || role.equals("warrior")) {
			System.out.print("Ur a Warrior!");
		}
		else if(role.equals("Rogue") || role.equals("rogue"))
		{
			System.out.print("Ur a Rogue!");
		}
		else{
			System.out.print("typo >:(");
		}
	}
}
