/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year))
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		printIfConsecutive(num1, num2, num3);
		System.out.println();
		System.out.println("----------------------------------------");
	}
	public static boolean isLeapYear(int year){
		if(year%4 == 0){
			return true;
		}else{
			return false;
		}
	}
	public static int getDigitSum(int number){
		int fifthDigit;
		int c1 = 1;
		int firstDigit = number;
		while(firstDigit>= 10){
			firstDigit = firstDigit/10;
			c1++;
		}
		fifthDigit = number - firstDigit;
		int c2 = 1;
		int secondDigit = number;
		while(secondDigit>= 100){
			secondDigit = secondDigit/10;
			c2++;
		}
		secondDigit = (secondDigit - firstDigit)/10;
		int c3 = 1;
		int thirdDigit = number;
		while(thirdDigit>= 1000){
			thirdDigit = thirdDigit/10;
			c3++;
		}
		thirdDigit = (thirdDigit - secondDigit)/100;
		int c4 = 1;
		int fourthDigit = number;
		while(fourthDigit>= 10000){
			fourthDigit = fourthDigit/10;
			c4++;
		}
		fifthDigit = number - fourthDigit;
		fourthDigit = (fourthDigit - thirdDigit)/1000;
		int sum = firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit;
		return sum;
		}
	public static void printIfConsecutive(int num1, int num2, int num3){
		if((num1 + 1) == num2 && (num2 + 1)== num3){
			System.out.print(num1 +", " + num2 + ", and " + num3 + " are consecutive numbers");
		}else{
			System.out.print("they aren't consecutive nums-")
		}
	}
	}
	

