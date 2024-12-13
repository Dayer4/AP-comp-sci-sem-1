/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior war[] = new Warrior[100];
		Wizard wiz[] = new Wizard[100];
		for(int i = 0; i < war.length; i++){
			war[i] = new Warrior();
		}
		for(int i = 0; i < wiz.length; i++){
			wiz[i] = new Wizard();
		}
		int a = 0;
		int b = 0;
		while(a!= 99 & b != 99){
			wiz[a].attack(war[b]);
			if(war[b].isDead()){
				b++;
				war[b].attack(wiz[a]);
			}else{
				war[b].attack(wiz[a]);
			}
			if(wiz[a].isDead()){
				a++;
				wiz[a].attack(war[b]);
			}else{
				wiz[a].attack(war[b]);
			}
		}
		if(a == 99){
			System.out.println("the warriors won with " + (100 - b) + " left");
		}
		if(b == 99){
			System.out.println("the wizards won with " + (100 - a) + " left");
		}
	}
}
