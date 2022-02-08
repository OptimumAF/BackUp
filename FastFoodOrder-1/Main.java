import java.util.Scanner;
class Main {
  public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String[][] menu = new String[5][2];
		menu[0][0] = "Hamburger";
		menu[0][1] = "3.75";
		menu[1][0] = "Fries";
		menu[1][1] = "1.00";
		menu[2][0] = "Soda";
		menu[2][1] = "1.50";
		menu[3][0] = "Shake";
		menu[3][1] = "3.00";
		menu[4][0] = "Double Hamburger";
		menu[4][1] = "4.50";
		/* MenuItem[0] = new MenuItem("Hamburger", 3.75);
		... etc */

		/* Print the menu by looping through the array and printing
			each MenuItem with a numerical label */
		for (int i = 0; i < menu.length; i++) {
			System.out.println((i+1) + ") " + menu[i][0] + " - $" + menu[i][1]);
		}

		/* Create a while loop that gives the following options and allows the user to control using input:
			1. Add item to order
			2. Remove item from order
			3. Complete order (show order details)
		*/
		boolean ordering = true;
		double sum = 0.0;
		int hamburgerNumber = 0;
		int friesNumber = 0;
		int sodaNumber = 0;
		int shakeNumber = 0;
		int doubleNumber = 0;
		while (ordering){
			System.out.println("\nDo you want to Add, Remove or Finish?");
			String picking = input.nextLine();
			if (picking.equals("Finish")) {
				ordering = false;
				System.out.println("\nOrder Finished! \n Time to pay!");
			}
			else if (picking.equals("Add")) {
				System.out.println("\nWhat item number do you want?");
				String itemNumber = input.nextLine();
				if (itemNumber.equals("1")) {
					hamburgerNumber++;
					System.out.println("Adding Hamburger...");
				}
				else if (itemNumber.equals("2")) {
					friesNumber++;
					System.out.println("Adding Fries");
				}
				else if (itemNumber.equals("3")) {
					sodaNumber++;
					System.out.println("Adding Soda...");
				}
				else if (itemNumber.equals("4")) {
					shakeNumber++;
					System.out.println("Adding Shake...");
				}
				else if (itemNumber.equals("5")) {
					doubleNumber++;
					System.out.println("Adding Double Hamburger...");
				}
				else {
					System.out.println("Wrong Item Number!");
				}
			}
			else if (picking.equals("Remove")) {
				System.out.println("\nWhat item number do you want to remove?");
				String itemNumber = input.nextLine();
				if (itemNumber.equals("1")) {
					if (hamburgerNumber> 0) {
						hamburgerNumber--;
					}
					System.out.println("Removing Hamburger...");
				}
				else if (itemNumber.equals("2")) {
					if (friesNumber> 0) {
						friesNumber--;
					}
					System.out.println("Removing Fries");
				}
				else if (itemNumber.equals("3")) {
					if (sodaNumber> 0) {
						sodaNumber--;
					}
					System.out.println("Removing Soda...");
				}
				else if (itemNumber.equals("4")) {
					if (shakeNumber> 0) {
						shakeNumber--;
					}
					System.out.println("Removing Shake...");
				}
				else if (itemNumber.equals("5")) {
					if (doubleNumber> 0) {
						doubleNumber--;
					}
					System.out.println("Removing Double Hamburger...");
				}
				else {
					System.out.println("Wrong Item Number!");
				}
			}
			else {
				System.out.println("Wrong Selection!");
			}
		}
		sum = hamburgerNumber * Double.valueOf(menu[0][1]) + friesNumber * Double.valueOf(menu[1][1]) + sodaNumber * Double.valueOf(menu[2][1]) + shakeNumber * Double.valueOf(menu[3][1]) + doubleNumber * Double.valueOf(menu[4][1]);

		System.out.println(hamburgerNumber + " Hamburgers");
		System.out.println(friesNumber + " Fries");
		System.out.println(sodaNumber + " Sodas");
		System.out.println(shakeNumber + " Shakes");
		System.out.println(doubleNumber + " Double Hamburgers");
		System.out.println("The sum is $" + sum);
  }
}