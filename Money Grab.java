import java.util.Scanner;
class Main {
	static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
	int dollars = 10;
    System.out.println("Welcome to Money Grab!");
	System.out.println("The game starts with 10 dollar bills on the board.");
	dollarDisplay(dollars);
	System.out.println("You will be playing against a computer, where every turn you and the computer gets\nto grab one to two dollars");
	System.out.println("The person to grab the last dollar wins!");
	System.out.println("Do you wish to start? Yes or No ");
	String start = input.nextLine();
	int playerTurn = 2 ;


	if (start.equals("yes") || start.equals("Yes")) {
		while (dollars>2) {
			if (playerTurn%2==0) {
				dollars = dollars - playerGrab();
				dollarDisplay(dollars);
				playerTurn++;
			}
			if (playerTurn%2==1) {
				dollars = dollars - computerGrab();
				dollarDisplay(dollars);
				playerTurn++;
			}
		}


		if (playerTurn%2==0) {
			dollars = dollars - playerGrab();
			dollarDisplay(dollars);
			if (dollars==0) {
				System.out.println("Congrats You Win!");
			}
			else {
				System.out.println("You Lose!");
			}
		}


		else if (playerTurn%2==1) {
			dollars = dollars - computerGrab();
			dollarDisplay(dollars);
			if (dollars==0) {
				System.out.println("You Lose!");
			}
			else {
				System.out.println("Congrats You Win!");
			}
		}
	}


	else if (start.equals("no") || start.equals("No")) {
		while (dollars>2) {
			if (playerTurn%2==1) {
				dollars = dollars - playerGrab();
				dollarDisplay(dollars);
				playerTurn++;
			}
			if (playerTurn%2==0) {
				dollars = dollars - computerGrab();
				dollarDisplay(dollars);
				playerTurn++;
			}
		}


		if (playerTurn%2==1) {
			dollars = dollars - playerGrab();
			dollarDisplay(dollars);
			if (dollars==0) {
				System.out.println("Congrats You Win!");
			}
			else {
				System.out.println("You Lose!");
			}
		}


		else if (playerTurn%2==0) {
			dollars = dollars - computerGrab();
			dollarDisplay(dollars);
			if (dollars==0) {
				System.out.println("You Lose!");
			}
			else {
				System.out.println("Congrats You Win!");
			}
		}
	}


	else {
		System.out.println("Wrong input!!! Shutting down...");
	}
  }



  public static int computerGrab() {
	  int grab = ((int)(Math.random()*2)) + 1;
	  System.out.print("The Computer Grabbed " + grab + " Dollars!\n");
	  return grab;
  }

  public static int playerGrab() {
	  System.out.print("How many dollars do you wish to grab? 1 or 2 ");
	  int grab = input.nextInt();
	  System.out.println("The Player Grabbed " + grab + " Dollars!\n");
	  return grab;
  }

  public static void dollarDisplay(int dollars) {
	  for (int i=0; i < dollars; i++) {
		  System.out.print("$ ");
	  }
	  System.out.println(" ");
  }
}