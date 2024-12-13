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
		int arrLength = ((int)(Math.random()*150)+51);
		int[] arr = new int[arrLength];
		for(int i = 0; i < arr.length; i++){
			arr[i] = ((int)(Math.random()*100)+1);
		}
		int min = Integer.MAX_VALUE;
		int max = 0;
		int count = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("Min: " + min);
		for(int i = 0; i < arr.length; i++){
			if(arr[i] > min){
				max = arr[i];
			}
		}
		System.out.println("Max: " + max);
		double total = 0.0;
		for(int i = 0; i < arr.length; i++){
			total = total + arr[i];
		}
		double avg = (total/arr.length);
		System.out.println("avg: " + avg);
		
	}
}
