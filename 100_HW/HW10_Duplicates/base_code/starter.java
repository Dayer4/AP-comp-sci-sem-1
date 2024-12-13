/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] bob = new int[20];
		for(int i = 0; i < bob.length; i++){
			bob[i] = (int)(Math.random()*10) + 1;
		}
		int random = (int)(Math.random()*10) + 1;
		int dupes = 0;
		System.out.println("looking for " + random);
		for(int i = 0; i < bob.length; i++){
			if(random == bob[i]){
				dupes++;
				System.out.println("Duplicate found at index " + i);
			}
		}
		System.out.println("Theres a total of " + dupes + " dupes.");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Looking for consecutives: ");
		int check = 0;
		for(int i = 0; i < (bob.length - 1); i++){
			check = i + 1;
			if(bob[i] == bob[check]){
				System.out.println("consecutive numbers found at indexes " + i + " and " + check  + ". The number checked was " + bob[i]);
			}
		}
	}
}
