import java.util.Scanner;
class Main {
	static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
	  System.out.println("Welcome to the grade checker!");
	  System.out.println("Where you can figure out grade you need for your final exam!");
	  checkingClasses(); //runs the program to start checking grades for classes
  }

  public static void checkingClasses() {
	  System.out.print("How many classes are you checking? ");
	  int classes = input.nextInt(); //takes to user input for how many classes are being checked
	  System.out.println("\n"); // creates a spacing
	  //The loops the grade finder for every class
	  for (int i = 0; i < classes; i++) {
		  System.out.println("Class " + (i+1)); //diplays the class you are checking
		  gradeFinder();//runs the grade finder method
		  System.out.println("\n--------------------------"); //creates spacing
		  System.out.print("\n\n"); //creates spacing
	  }
  }

  public static void gradeFinder() {
	  System.out.print("What grade are you looking for? "); 
	  double summative = input.nextDouble(); //takes the input for final grade wanted
	  System.out.print("What is your first quarter grade? ");
	  double quarterOne = input.nextDouble(); //takes the input for first quarter grade
	  System.out.print("What is your second quarter grade? ");
	  double quarterTwo = input.nextDouble(); //takes the input for the second quarter grade
	  System.out.print("What percent of your grade is your semester exam word? ");
	  double percentage = input.nextDouble(); // takes the percentage worth of final exam
	  double quarterSplit = (100-percentage)/2/100;  //calculates how much the quarters are worth
	  double neededSemester = (summative - quarterSplit * quarterOne - quarterSplit * quarterTwo) / (percentage / 100); //calculates the final exam grade neeeded
	  double finalExam = (double)((int)(neededSemester*100)) / 100; //deletes the excess decimal points in the double
	  //checks if the grade is possible
	  if (neededSemester>0 && neededSemester <=100) {
		  System.out.print("You need a " + finalExam + "% on your final exam to get a " + summative + "%"); //outputs the final exam grade needed
	  }
	  else {
		  System.out.print("It is impossible to get that grade");
	  }
	  
  }
}