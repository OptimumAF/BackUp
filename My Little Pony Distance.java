import java.util.Scanner;

class Main {
	static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
	  Trip();
	  System.out.println("----------------------");
	  totalTrip();
	  System.out.println("----------------------");
	  // System.out.println("Distance from Baltimare (29, 16) to Manehattan (34, 8)=" + distance(29,16,34,8));
	  // System.out.println("Distance from Los Pegasus (6, 19) to Neighagra Falls (22, 7)=" + distance(6,19,22,7));
	  // System.out.println("Distance from the Badlands (25, 24) to Ponyville (16, 14)=" + distance(25,24,16,14));

  }
  public static void Trip(){
	  System.out.println("You wake up to the smell of horse dung and a high pitch voice calling your name...");
	  System.out.println("\"Princess Luna wake up!!!\"");
	  System.out.println("You look up to see princess Celestia staring right at you.");
	  System.out.println("Princess Celestia says\"Again, what is the diameter of the path we are going\"");
	  System.out.println("\"Oh yea, the path has a diameter of ....\"");
	  double diameter = input.nextDouble();
	  System.out.println("Princess Celestia quickly responds\"That means we have to travel " + roadTrip(diameter) + " in total\"");
  }
  public static double roadTrip(double diameter) {
	  return diameter*Math.PI;
  }
  public static void totalTrip(){
	  System.out.println("Rainbow Dash is going on a trip and is starting at the center of equestria (0,0). Pick three locations for her to go to.");
	  System.out.println("What is the coords of the first place (X-coords first, then Y-coords)");
	  double x1 = input.nextDouble();
	  double y1 = input.nextDouble();
	  System.out.println("What is the coords of the second place (X-coords first, then Y-coords)");
	  double x2 = input.nextDouble();
	  double y2 = input.nextDouble();
	  System.out.println("What is the coords of the third place (X-coords first, then Y-coords)");
	  double x3 = input.nextDouble();
	  double y3 = input.nextDouble();
	  double totalDistance = distance(0,0,x1,y1) + distance(x1,y1,x2,y2) + distance(x2,y2,x3,y3) + distance(x3,y3,0,0);
	  double roundedTotalDistance = Math.round(totalDistance*100.0)/100.0;
	  System.out.println("Rainbow Dash travelled a total of " + roundedTotalDistance);
  }
  public static void distanceInputTwoPoints(){
	  System.out.println("X1:");
	  double x1 = input.nextDouble();
	  System.out.println("Y1:");
	  double y1 = input.nextDouble();
	  System.out.println("X2:");
	  double x2 = input.nextDouble();
	  System.out.println("Y2:");
	  double y2 = input.nextDouble();
	  System.out.println("The distance is: " + distance(x1,y1,x2,y2));
  }
  public static double distance(double x1,double y1,double x2,double y2){
	  return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
  }
}