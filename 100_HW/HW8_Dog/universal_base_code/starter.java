/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog bob = new Dog();
		bob.setAge(123);
		Dog bob2 = new Dog();
		bob2.setName("bobious");
		bob2.setBreed("cat");
		if(bob.isSleeping()){
			bob.bark();
			
		}
		if((bob.isSleeping() && bob2.isSleeping()) || bob.isSleeping() && !bob2.isSleeping()){
			bob.bark();
			bob2.bark();
		}

	}
}
