/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Cipher cypher = new Cipher();
		Scanner sc = new Scanner(System.in);
		System.out.println("gimme a thing to encrypt");
		String z = sc.nextLine();
		System.out.println(cypher.encode(z));
		//====================================================Section 2 ==========================================================================
		int e = 0;
		System.out.println("gimme a thing to encrypt for the 2nd section");
		String a = sc.nextLine();
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		System.out.println(cypher.keyedEncode(a, e));
		e++;
		
		System.out.println("gimme another thing to encrypt for the 2nd section");
		String y = sc.nextLine();
		int b = 0;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println(cypher.keyedEncode(y, b));
		b++;
		System.out.println("gimme a message to encrypt");
		String Qwe = sc.nextLine();
		System.out.println(cypher.encode(Qwe));
	}
}
