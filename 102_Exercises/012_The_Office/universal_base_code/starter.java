/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee Dwight = new Employee(1987, "Dwight", "Shrute", 4416.66);
		Dwight.raiseSalary(10);
		Employee Jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Jim.raiseSalary(10);
		Employee Pam = new Employee(2011, "Pam", "beesly", 2250);
		Pam.raiseSalary(10);
		Employee bob = new Employee(1234, "ethan", "lima", 560.01);
		bob.raiseSalary(10);
		System.out.println(Dwight.getSalary());
		System.out.println(Dwight.getAnnualSalary());
		System.out.println(Jim.getSalary());
		System.out.println(Jim.getAnnualSalary());
		System.out.println(Pam.getSalary());
		System.out.println(Pam.getAnnualSalary());
		System.out.println(bob.getSalary());
		System.out.println(bob.getAnnualSalary());
	}
}
