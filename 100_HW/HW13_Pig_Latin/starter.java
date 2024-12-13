/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;
class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("gimme a sentence");
		String eng = sc.nextLine();
		String word = "";
		String f1 = "";
		String f2 = "";
		String[] consonants = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z","b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		for(int i = 0; eng.indexOf(" ") != -1; i++){
			word = eng.substring(0, eng.indexOf(" "));
			f1 = word.substring(0,1);
			f2 = word.substring(1,2);
			if(consonantCheck(f1) && consonantCheck(f2)){
				System.out.print(word.substring(2) + "-" + f1 + f2 + "ay ");
			}else if(consonantCheck(f1)){
				System.out.print(word.substring(1) + "-" + f1 + "ay ");
			}else{
				System.out.print(word + "-way ");
			}
			eng = eng.substring(eng.indexOf(" ") + 1);
		}
			word = eng.substring(0);
			f1 = word.substring(0,1);
			f2 = word.substring(1,2);
			if(consonantCheck(f1) && consonantCheck(f2)){
				System.out.print(word.substring(2) + "-" + f1 + f2 + "ay ");
			}else if(consonantCheck(f1)){
				System.out.print(word.substring(1) + "-" + f1 + "ay ");
			}else{
				System.out.print(word + "-way ");
			}
			eng = eng.substring(eng.indexOf(" ") + 1);
		}
		public static boolean consonantCheck(String letter){
			String[] consonants = {"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z","b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
			for(int i = 0; i < consonants.length; i++){
				if(letter.equals(consonants[i])){
					return true;
				}
		}
		return false;
	}
}


