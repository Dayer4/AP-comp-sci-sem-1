/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.println("Gimme a #");
	Scanner sc = new Scanner(System.in);
	
	double num = sc.nextDouble();
	System.out.println("The 5 numbers after" + num + " is");
	System.out.print((num + 1) + ",");
	System.out.print((num + 2) +",");
	System.out.print((num + 3) +",");
	System.out.print((num + 4) +",");
	System.out.println((num + 5) +",");
	System.out.println("The 5 multiples after" + num + " is");
	System.out.print((num * 2) +",");
	System.out.print((num * 3) +",");
	System.out.print((num * 4) +",");
	System.out.print((num * 5) +",");
	System.out.println((num * 6) +",");
	System.out.println(num + " divided by 100 is");
	System.out.println(num/100);
	System.out.println(num + " divided by 10 is");
	System.out.print(num/10);
	}
}
