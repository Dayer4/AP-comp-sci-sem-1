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
		BaseClass test = new BaseClass();
		// Scanner sc = new Scanner(System.in);
		// System.out.print gimme a sentence
		// String input = sc.nextLine();
		String input = "1 2 3 4 5";
		String output = "";
		String check = "";
		for(int i = input.length(); i > 0; i--){
			check = input.substring(i-1);
			if(check.indexOf(" ") != -1){
				output = output + input.substring(i);
				//this doesnt run^^^
				input = input.substring(0, i);
			}
		}
		output = output +
		System.out.println(output);
	}

}
