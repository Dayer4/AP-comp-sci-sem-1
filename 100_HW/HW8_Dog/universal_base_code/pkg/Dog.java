package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		String breed;
	public Dog() {
		 name="Clifford";
		 age=3;
		 breed="big red dog";
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String a, String b){
		name = a;
		breed = b;
		age = 1;
	}
	public Dog(int a, String b){
		age = a;
		name = b;
		breed = "dog dog";
	}
	public void setName(String a){
		name = a;
	}
	public void setAge(int a){
		age = a;
	}
	public void setBreed(String a){
		breed = a;
	}
	public String getBreed(){
		return breed;
	}
	public int getAge(String a){
		return age;
	}
	public String getName(String a){
		return name;
	}
	public boolean isSleeping(){
		int check = ((int)(Math.random() * 2));
		if(check == 1){
			return true;
		}else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name + " barks");
	}
	
	
}
