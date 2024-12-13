import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int count = 0;
		 int []bob1 = new int[1000];
		 int []bob2 = new int[1000];
		 while(count < 1001){
		 	bob1[count] = ((count * 3) + 3);
		 	System.out.println(bob1[count]);
		 	bob2[count] = (1000 - count);
		 	System.out.println(bob2[count]);
		 	count++;
		 }
	}
}
