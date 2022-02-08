import java.util.Scanner;
class Main {
	static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    int number = input.nextInt(); //integer input
	boolean running = true;
	int count = 0;
	while (running) {
		if (number % 2 == 1 || number % 2 == -1) {
			number = number*3 + 1;
			System.out.println(number);
			count++;
		}
		if (number % 2 == 0) {
			number = number / 2;
			System.out.println(number);
			count++;
		}
		if (number == 1 || number == -1) {
			running = false;
			System.out.println("\n" + count);
		}
		
	}
  }
}