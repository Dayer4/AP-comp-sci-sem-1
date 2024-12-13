/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int z = sc.nextInt();
	// largest int
		if(x>y && x>z){
			System.out.println("The largest integer is " + x);
		};
		if(y>x && y>z){
			System.out.println("The largest integer is " + y);
		};
		if(z>y && z>x){
			System.out.println("The largest integer is " + z);
		};
		//smallest int 
		if(x<y && x<z){
			System.out.println("The smallest integer is " + x);
		};
		if(y<x && y<z){
			System.out.println("The smallest integer is " + y);
		};
		if(z<y && z<x){
			System.out.println("The smallest integer is " + z);
		};
	}
}
