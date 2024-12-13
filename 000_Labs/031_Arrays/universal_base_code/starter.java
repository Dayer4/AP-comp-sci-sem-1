/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;
//Make an array of integers
// ○ Set the size to 10
// Give all 10 elements the following:
// ○ Respectively 9 to 0
// ○ Ex: index 0 has 9 and
// index 9 has 0
// ○ Print out all numbers

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
	int [] arr = new int[10];
	int i = 9;
	int c = 0;
	while(i != 0){
	arr[c] = i;
	i--;
	c++;
	}
	System.out.print(arr[9]);
	}
}
