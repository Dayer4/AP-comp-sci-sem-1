/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What day of the week is it as a number? (0 = Sunday, 1 = Mon, 2 = Tue, 3 = Wed, etc..)");
		int day = sc.nextInt();
		if (day == 0 || day == 6){
			System.out.print("wake up at 10 am");
		} else {
			System.out.print("wake up at 7 am");
		}
	}
}
