/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("gimme a number");
		double a = sc.nextDouble();
		System.out.println("gimme another number");
		double b = sc.nextDouble();
//===================================================Divisbles for first number======================================================
		if(a/2 == ((int)a)/2){
			System.out.println(a + " is even");
		}else{
			System.out.println(a + "is odd");
		}
		if(a/3 == ((int)a)/3){
			System.out.println(a + " is divisible by 3");
		}else{
			System.out.println(a + " isn't divisible by 3");
		}
		if(a/4 == ((int)a)/4){
			System.out.println(a + " is divisible by 4");
		}else{
			System.out.println(a + " isn't divisible by 4");
		}
		if(a/5 == ((int)a)/5){
			System.out.println(a + " is divisible by 5");
		}else{
			System.out.println(a + " is divisible by 5");
		}
//===================================================Divisbles for second number======================================================
		if(b/2 == ((int)b)/2){
			System.out.println(b + " is even");
		}else{
			System.out.println(b + "is odd");
		}
		if(b/3 == ((int)b)/3){
			System.out.println("the second number divisible by 3");
		}else{
			System.out.println("the second number  isn't divisible by 3");
		}
		if(b/4 == ((int)b)/4){
			System.out.println("the second number  divisible by 4");
		}else{
			System.out.println("the second number  isn't divisible by 4");
		}
		if(b/5 == ((int)b)/5){
			System.out.println("the second number  divisible by 5");
		}else{
			System.out.println("the second number  isn't divisible by 5");
		}
		
	}
}
