import java.util.*;
/* Name(s):
Description of this program:

*/

class Main
{
	static Random rand = new Random(); 
	static Scanner scan = new Scanner(System.in);
	// use scan.nextInt() scan.nextDouble() and scan.nextLine()
	// to read user input

// declaring variables to use in multiple methods:
	public static int sides;
	public static int success;
	public static int times;
	public static int number = 0;
	public static int result;

	public static void main(String[] args){
		System.out.println("How many sides would you like on your die?");
		int sides = scan.nextInt();

		System.out.println("What minimum value do you need for a successful roll?");
		int success = scan.nextInt();

		System.out.println("How many times would you like to roll?");
		int times = scan.nextInt();
		System.out.println();
		diceRoll(times,sides,success);
	
	}
	public static int diceRoll(int times,int sides, int success){
	// as long as # of dice rolls != 0, the method will keep rolling and printing each rolls' results
		for (int i = times; i > 0; i--){
			
			int result = rand.nextInt(sides + 1);
			System.out.println("Your roll(s): " + result);
		

		// after each roll, this records how many successes (to print later)
			if (result >= success){
				number = (number + 1);
			}
		
		}
			System.out.println("Number of successful rolls: " + number);
			return times;
	}

}

	// Include a roll method with comments explaining the method.
	// You can add additional helper methods if necessary
	
