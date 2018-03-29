import java.util.Scanner;

class dice {
	private Dice dice = new Dice();
	private int score = 500;
	private void start(){
		while (true) {
			System.out.println("You have 500 points");
			System.out.println("Enter points to wager (-1 to QUIT)");
			
			try{
				Scanner input = new Scanner(System.in);
				int opt = input.nextInt();
				
				while (opt > 500) {
					System.out.println("Please enter a wager less than or equal to 500");
				}
				while (opt == 0) {
					System.out.println("You must enter at lease one (1) point!");
				}
				if (opt == -1) {
					break;
				}
				this.option(opt);
			}catch (InputMismatchException m) {
				System.out.println("Please reenter points in intergers.");
			}
		}
	}
	
	}
	 void roll(){
		int die1,die2,com1,com2;
		die1 = (int)(Math.random()*6)+1;
		die1 = (int)(Math.random()*6)+1;
		com1 = (int)(Math.random()*6)+1;
		com2 = (int)(Math.random()*6)+1;
		return die1,die2;
		return com1,com2;
	}
	void winOrLose(){
		int tot = die1 + die2;
		int tot2 = com1 + com2;
		while (tot2 > tot) {
			System.out.println("s")
		}
	}
	void lost(){
		for (int i = 0; i <= 500; i++) {
			opt++;
		}
	}
	public static void main(String[] args) {
		roll();
	}
}