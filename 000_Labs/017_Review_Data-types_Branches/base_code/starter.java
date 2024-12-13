/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("gimme ur name");
		String name = sc.nextLine();
		System.out.println("gimme a title");
		String title = sc.nextLine();
		System.out.println("hello " + name + " the " + title);
		System.out.println("Do you want to be a Wizard, Warrior, or Rogue");
		String role = sc.nextLine();
		if (role.equals("Wizard") || role.equals("wizard")) {
			System.out.println("Ur a wizard!");
		}
		else if(role.equals("warrior") || role.equals("warrior")) {
			System.out.println("Ur a Warrior!");
		}
		else if(role.equals("Rogue") || role.equals("rogue"))
		{
			System.out.println("Ur a Rogue!");
		}
		else{
			System.out.println("typo >:(");
		}
		System.out.println("you have 20 points to spend on traits. Also, you can only spend 10 point max per trait.");
		System.out.println("The traits you have are Strength - Buff and able to carry larger items, Dexterity - Agile and moves quick, Intelligence - Better at magic spells!, and Charisma - How personable");
		System.out.println("how many points do you want to spend on Strength?");
			//==========================================================strength points========================================================================
		int points = 20;
		int strengthPoints = sc.nextInt();
		if(strengthPoints <= 10){
			System.out.println("You spent " + strengthPoints + " on strength" + " you have" + (points - strengthPoints) + "points left.");
		}else{
			System.out.println("You can't put that many points on a trait. Put a smaller number ");
		}
		points = points - strengthPoints;
		System.out.println("you have " + points + "points left");
		//==========================================================Dexterity points========================================================================
		System.out.println("how many points do you want to spend on Dexterity?");
		int dexterityPoints = sc.nextInt();
		if(dexterityPoints <= 10){
			System.out.println("You spent " + dexterityPoints + " on Dexterity" + " you have" + (points - dexterityPoints) + "points left.");
		}else{
			System.out.println("You can't put that many points on a trait. Put a smaller number");
			sc.nextInt();
		}
		points = points - dexterityPoints;
		//==========================================================intelligence points========================================================================
		System.out.println("how many points do you want to spend on intelligence?");
		int intelligencePoints = sc.nextInt();
		if(dexterityPoints <= 10){
			System.out.println("You spent " + intelligencePoints + " on intelligence" + " you have" + (points - intelligencePoints) + "points left.");
		}else{
			System.out.println("You can't put that many points on a trait. Put a smaller number");
			sc.nextInt();
		}
		points = points - intelligencePoints;
		//==========================================================charisma points========================================================================
		System.out.println("how many points do you want to spend on charisma?");
		int charismaPoints = sc.nextInt();
		if(dexterityPoints <= 10){
			System.out.println("You spent " + charismaPoints + " on charisma" + " you have" + (points - charismaPoints) + "points left.");
		}else{
			System.out.println("You can't put that many points on a trait. Put a smaller number");
			sc.nextInt();
		}
		//=============================================================================Stats + name + title=================================================================================
		System.out.println(name + " the " + title + " your a " + role + "with the following stats: ");
		System.out.println("Strength: " + strengthPoints);
		System.out.println("Dexterity: " + dexterityPoints);
		System.out.println("Intelligence: " + intelligencePoints);
		System.out.println("Charisma: " + charismaPoints);
	}
};