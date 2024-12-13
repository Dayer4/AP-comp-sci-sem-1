/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = (int)((Math.random() * 10) + 1);
		System.out.println("guess a number");
		int b = sc.nextInt();
		while (a != b){
			b = sc.nextInt();
			if(a == b){
				break;
			}else{
				System.out.println("guess again");
			}
		}
		System.out.println("CORRECT !!!!!!");
	}
}
