/*
 *	Author:  
 *  Date: 
*/

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.print("Happy Birth day to you"); 
		System.out.print("Happy Birth day to you"); 
		System.out.print("Happy Birth day Dear Bob"); 
		System.out.print("Happy Birth day Dear Bob"); 
	}
}
public boolean makeBricks(int small, int big, int goal) {
  int total = small + (big * 5);
  int need = goal%5;
  if(small < need){
    return false;
  }
  if(total >= goal){
    return true;
  }
  if(total < goal){
    return false;
  }
  return false;
}
