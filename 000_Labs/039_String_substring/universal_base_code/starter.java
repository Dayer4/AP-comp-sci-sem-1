/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("gimme a word");
		String text = sc.nextLine();
		for(int i = 0; i < (text.length()); i++){
			System.out.println(i + ". " + text.substring(i, i+1));
		}
	}
}
