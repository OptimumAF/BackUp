import java.util.Scanner;
class Main {
	static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
	  System.out.println("What is the time?");
	  String timeInput = input.nextLine();
	  int hours;
	  int minutes;
	  String timeOfDay;
	  int colon = 0;
	  int space = 0;
	  String output = "";
	  for (int i = 0; i<timeInput.length()-1;i++) {
		  String check = timeInput.substring(i,i+1);
		  if (check.equals(":")) {
			  colon = i;
		  }
	  }
	  for (int j = 0; j<timeInput.length()-1;j++) {
		  String check = timeInput.substring(j,j+1);
		  if (check.equals(" ")) {
			  space = j;
		  }
	  }
	  hours = Integer.valueOf(timeInput.substring(0,colon));
	  minutes = Integer.valueOf(timeInput.substring(colon+1,colon+3));
	  timeOfDay = timeInput.substring(space+1, timeInput.length());
	  //System.out.println(hours);
	  //System.out.println(minutes);
	  //System.out.println(timeOfDay);
	  for (int i = 0; i<hours; i++) {
		  output += ":o2:";
	  }
	  for (int i = 0; i<minutes/5; i++) {
		  output += ":o:";
	  }
	  if (timeOfDay.equals("AM") || timeOfDay.equals("A.M.") || timeOfDay.equals("am") || timeOfDay.equals("a.m.")) {
		  output += ":sunny:";
	  }
	  if (timeOfDay.equals("PM") || timeOfDay.equals("P.M.") || timeOfDay.equals("pm") || timeOfDay.equals("p.m.")) {
		  output += ":full_moon:";
	  }
	  System.out.println(output);
  }
}