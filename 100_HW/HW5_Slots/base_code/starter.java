import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		int money = 100;
		System.out.print("Slot Machine Rules: \n 1.Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.\n   a. If two numbers match, you double your money.\n   b. If three numbers match, you triple your money.\n   c. If none match, you lose your money.\n");
		while(money != 0){
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y) :");
		String yesOrNo = sc.nextLine();
		if(yesOrNo.equals("yes")||yesOrNo.equals("Yes")||yesOrNo.equals("y")||yesOrNo.equals("Y")){
			System.out.println("how much do you want to gamble (has to be less than or equal to " + money + "):");
			int wager = sc.nextInt();
			if(wager <= money && wager >=0){
				money = money - wager;
				int num1 = (int)(Math.random() * 10)+1;
				int num2 = (int)(Math.random() * 10)+1;
				int num3 = (int)(Math.random() * 10)+1;
				System.out.println("|| " + num1 + "|| " + "|| " + num2 + "|| " + num3 + " ||");
				if(num1 == num2 && num2 == num3 && num1 == num3){
					money = money + (wager*3);
					System.out.println("JACKPOT\n Now you have $" + money);
				}else if(num1 == num2 || num2 == num3 || num1 == num3){
					money = money + (wager * 2);
					System.out.println("congrats\n Now you have $" + money);
				}else{
					System.out.println("boo hoo you lost $" + wager);
					
				}
			}
			}else if(yesOrNo.equals("no")||yesOrNo.equals("No")||yesOrNo.equals("n")||yesOrNo.equals("N")){
				break;
			}
		}
		System.out.print("awww");
		}
	}