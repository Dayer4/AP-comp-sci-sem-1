package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	public Spider(){
		actor = "unknown";
		age = 0;
		villain = "unknown";
	}
	public Spider(String a){
		actor = "unknown";
		age = 0;
		villain = a;
	}
	public Spider(int a){
		actor = "unknown";
		age = a;
		villain = "unknown";
	}
	public Spider(String a, int b){
		actor = a;
		age = b;
		villain = "unknown";
	}
	public Spider(String actor, int b, String c){
		this.actor = actor;
		age = b;
		villain = c;
	}
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public int getAge(){
		return age;
	}
	public int setAge(int a){
		age = a;
	}
	public int getVillain(){
		return age;
	}
	public int setVillain(string a){
		villain = a;
	}
	public int getName(){
		return age;
	}
	public int setName(string a){
		name = a;
	}

	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
