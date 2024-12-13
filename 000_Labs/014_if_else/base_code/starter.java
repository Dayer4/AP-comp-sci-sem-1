/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;
//# guessing game 1-1000
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int random = ((int) Math.random() * 10);
		int number = sc.nextInt();
		if (random == number){
		System.out.println("You guessed the right number :D");
		}else{
			System.out.println("You guessed the wrong number :(");
		};
	}
}
