/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		
		PooleDwarf q = new PooleDwarf();
		q.setName(randName());
		PooleDwarf w = new PooleDwarf();
		w.setName(randName());
		PooleDwarf e = new PooleDwarf();
		e.setName(randName());
		PooleDwarf r = new PooleDwarf();
		r.setName(randName());
		PooleDwarf t = new PooleDwarf();
		t.setName(randName());
		PooleDwarf y = new PooleDwarf();
		y.setName(randName());
		PooleDwarf u = new PooleDwarf();
		u.setName(randName());
		int i = 0;
		if(q.isSameName(w.getName())){
			i++;
		}
		if(q.isSameName(e.getName())){
			i++;
		}
		if(q.isSameName(r.getName())){
			i++;
		}
		if(q.isSameName(t.getName())){
			i++;
		}
		if(q.isSameName(y.getName())){
			i++;
		}
		if(q.isSameName(u.getName())){
			i++;
		}
		System.out.print("there are " + i + " duplicated of the name " + q.getName());
	}
}
