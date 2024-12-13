package pkg;
import java.util.Scanner;
import java.util.Random;


public class game{
	Scanner sc = new Scanner(System.in);
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;

	public game(){
		role = "none";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
		
	}
	public void myToString(){
		System.out.println("ur role is " + role);
		System.out.println("ur strength is " + strength);
		System.out.println("ur dexterity is " + dexterity);
		System.out.println("ur intelligence is " + intelligence);
		System.out.println("ur charisma is " + charisma);
	}
	int setStrength(int a){
		if(a >= 0){
			strength = a;
		}else{
			strength = 0;
		}
		return strength;
	}
	int setDexterity(int a){
		if(a >= 0){
			dexterity = a;
		}else{
			dexterity = 0;
		}
		return dexterity;
	}
	int setIntelligence(int a){
		if(a >= 0){
			intelligence = a;
		}else{
			intelligence = 0;
		}
		return intelligence;
	}
	int setCharisma(int a){
		if(a >= 0){
			charisma = a;
		}else{
			charisma = 0;
		}
		return charisma;
	}
	public void setAll(String a, int b, int c, int d, int e){
		role = a;
		setDexterity(b);
		setIntelligence(c);
		setCharisma(d);
		setStrength(e);
	}
}