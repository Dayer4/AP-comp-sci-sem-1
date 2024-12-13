/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Gimme a small #");
		int smallNum = sc.nextInt();
		System.out.println("Gimme a bigger #");
		int bigNum = sc.nextInt();
		System.out.println("5 numbers in the given range are");
		System.out.print((int)((Math.random()) * bigNum) + smallNum + ", ");
		System.out.print((int)((Math.random()) * bigNum) + smallNum + ", ");
		System.out.print((int)((Math.random()) * bigNum) + smallNum + ", ");
		System.out.print((int)((Math.random()) * bigNum) + smallNum + ", ");
		System.out.print((int)((Math.random()) * bigNum) + smallNum);
	}
}
