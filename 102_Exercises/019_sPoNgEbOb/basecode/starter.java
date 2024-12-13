import java.util.*;
class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("gimme word");
	String word = sc.nextLine();
	word = word.toLowerCase();
	String letter = "";
	for(int i = 0; i < word.length(); i++){
		if(i%2 == 0){
		System.out.print(word.substring(i, i + 1));
		}else{
			letter = word.substring(i, i + 1);
			System.out.print(letter.toUpperCase());
		}
	}
	}
	public static String spongeCase(String word){
		
		
	}
	
}
