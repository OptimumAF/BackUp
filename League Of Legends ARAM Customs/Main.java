import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;
class Main {
	static Scanner input = new Scanner(System.in); //required for input function
  public static void main(String[] args)
  {
	  System.out.println("Type 0 if champions are correct");
	  System.out.println("Type specified number to reroll champion");
    List championList = Array.readFileInList("Champions.txt");
	String championRoster[];
	championRoster = new String[championList.size()];
	championList.toArray(championRoster);


	String playerOne = championRoster[numberGen()];
	String playerTwo = championRoster[numberGen()];
	String playerThree = championRoster[numberGen()];
	String playerFour = championRoster[numberGen()];
	String playerFive = championRoster[numberGen()];
	String playerSix = championRoster[numberGen()];
	String playerSeven = championRoster[numberGen()];
	String playerEight = championRoster[numberGen()];
	String playerNine = championRoster[numberGen()];
	String playerTen = championRoster[numberGen()];
	int teamOne = 0;
	int teamTwo = 0;
	boolean reroll = true;
	while(reroll) {
		System.out.println("\nTeam One - " + teamOne);
		System.out.println("1  - " + playerOne);
		System.out.println("2  - " + playerTwo);
		System.out.println("3  - " + playerThree);
		System.out.println("4  - " + playerFour);
		System.out.println("5  - " + playerFive);
		System.out.println("\nTeam Two - " + teamTwo);
		System.out.println("6  - " + playerSix);
		System.out.println("7  - " + playerSeven);
		System.out.println("8  - " + playerEight);
		System.out.println("9  - " + playerNine);
		System.out.println("10 - " + playerTen);
		System.out.println("\n");
		if (playerOne.equals(playerTwo) || playerOne.equals(playerThree) || playerOne.equals(playerFour) || playerOne.equals(playerFive) || playerOne.equals(playerSix) || playerOne.equals(playerSeven) || playerOne.equals(playerEight) || playerOne.equals(playerNine) || playerOne.equals(playerTen)) {
			playerOne = championRoster[numberGen()];
			System.out.println("\nTeam One - " + teamOne);
			System.out.println("1  - " + playerOne);
			System.out.println("2  - " + playerTwo);
			System.out.println("3  - " + playerThree);
			System.out.println("4  - " + playerFour);
			System.out.println("5  - " + playerFive);
			System.out.println("\nTeam Two - " + teamTwo);
			System.out.println("6  - " + playerSix);
			System.out.println("7  - " + playerSeven);
			System.out.println("8  - " + playerEight);
			System.out.println("9  - " + playerNine);
			System.out.println("10 - " + playerTen);
			System.out.println("\n");
		}
		if (playerTwo.equals(playerOne) || playerTwo.equals(playerThree) || playerTwo.equals(playerFour) || playerTwo.equals(playerFive) || playerTwo.equals(playerSix) || playerTwo.equals(playerSeven) || playerTwo.equals(playerEight) || playerTwo.equals(playerNine) || playerTwo.equals(playerTen)) {
			playerTwo = championRoster[numberGen()];
			System.out.println("\nTeam One - " + teamOne);
			System.out.println("1  - " + playerOne);
			System.out.println("2  - " + playerTwo);
			System.out.println("3  - " + playerThree);
			System.out.println("4  - " + playerFour);
			System.out.println("5  - " + playerFive);
			System.out.println("\nTeam Two - " + teamTwo);
			System.out.println("6  - " + playerSix);
			System.out.println("7  - " + playerSeven);
			System.out.println("8  - " + playerEight);
			System.out.println("9  - " + playerNine);
			System.out.println("10 - " + playerTen);
			System.out.println("\n");
		}
		if (playerThree.equals(playerTwo) || playerThree.equals(playerOne) || playerThree.equals(playerFour) || playerThree.equals(playerFive) || playerThree.equals(playerSix) || playerThree.equals(playerSeven) || playerThree.equals(playerEight) || playerThree.equals(playerNine) || playerThree.equals(playerTen)) {
			playerThree = championRoster[numberGen()];
			System.out.println("\nTeam One - " + teamOne);
			System.out.println("1  - " + playerOne);
			System.out.println("2  - " + playerTwo);
			System.out.println("3  - " + playerThree);
			System.out.println("4  - " + playerFour);
			System.out.println("5  - " + playerFive);
			System.out.println("\nTeam Two - " + teamTwo);
			System.out.println("6  - " + playerSix);
			System.out.println("7  - " + playerSeven);
			System.out.println("8  - " + playerEight);
			System.out.println("9  - " + playerNine);
			System.out.println("10 - " + playerTen);
			System.out.println("\n");
		}
		if (playerFour.equals(playerTwo) || playerFour.equals(playerThree) || playerFour.equals(playerOne) || playerFour.equals(playerFive) || playerFour.equals(playerSix) || playerFour.equals(playerSeven) || playerFour.equals(playerEight) || playerFour.equals(playerNine) || playerFour.equals(playerTen)) {
			playerFour = championRoster[numberGen()];
			System.out.println("\nTeam One - " + teamOne);
			System.out.println("1  - " + playerOne);
			System.out.println("2  - " + playerTwo);
			System.out.println("3  - " + playerThree);
			System.out.println("4  - " + playerFour);
			System.out.println("5  - " + playerFive);
			System.out.println("\nTeam Two - " + teamTwo);
			System.out.println("6  - " + playerSix);
			System.out.println("7  - " + playerSeven);
			System.out.println("8  - " + playerEight);
			System.out.println("9  - " + playerNine);
			System.out.println("10 - " + playerTen);
			System.out.println("\n");
		}
		if (playerFive.equals(playerTwo) || playerFive.equals(playerThree) || playerFive.equals(playerFour) || playerFive.equals(playerOne) || playerFive.equals(playerSix) || playerFive.equals(playerSeven) || playerFive.equals(playerEight) || playerFive.equals(playerNine) || playerFive.equals(playerTen)) {
			playerFive = championRoster[numberGen()];
			System.out.println("\nTeam One - " + teamOne);
			System.out.println("1  - " + playerOne);
			System.out.println("2  - " + playerTwo);
			System.out.println("3  - " + playerThree);
			System.out.println("4  - " + playerFour);
			System.out.println("5  - " + playerFive);
			System.out.println("\nTeam Two - " + teamTwo);
			System.out.println("6  - " + playerSix);
			System.out.println("7  - " + playerSeven);
			System.out.println("8  - " + playerEight);
			System.out.println("9  - " + playerNine);
			System.out.println("10 - " + playerTen);
			System.out.println("\n");
		}
		if (playerSix.equals(playerTwo) || playerSix.equals(playerThree) || playerSix.equals(playerFour) || playerSix.equals(playerFive) || playerSix.equals(playerOne) || playerSix.equals(playerSeven) || playerSix.equals(playerEight) || playerSix.equals(playerNine) || playerSix.equals(playerTen)) {
			playerSix = championRoster[numberGen()];
			System.out.println("\nTeam One - " + teamOne);
			System.out.println("1  - " + playerOne);
			System.out.println("2  - " + playerTwo);
			System.out.println("3  - " + playerThree);
			System.out.println("4  - " + playerFour);
			System.out.println("5  - " + playerFive);
			System.out.println("\nTeam Two - " + teamTwo);
			System.out.println("6  - " + playerSix);
			System.out.println("7  - " + playerSeven);
			System.out.println("8  - " + playerEight);
			System.out.println("9  - " + playerNine);
			System.out.println("10 - " + playerTen);
			System.out.println("\n");
		}
		if (playerSeven.equals(playerTwo) || playerSeven.equals(playerThree) || playerSeven.equals(playerFour) || playerSeven.equals(playerFive) || playerSeven.equals(playerSix) || playerSeven.equals(playerOne) || playerSeven.equals(playerEight) || playerSeven.equals(playerNine) || playerSeven.equals(playerTen)) {
			playerSeven = championRoster[numberGen()];
			System.out.println("\nTeam One - " + teamOne);
			System.out.println("1  - " + playerOne);
			System.out.println("2  - " + playerTwo);
			System.out.println("3  - " + playerThree);
			System.out.println("4  - " + playerFour);
			System.out.println("5  - " + playerFive);
			System.out.println("\nTeam Two - " + teamTwo);
			System.out.println("6  - " + playerSix);
			System.out.println("7  - " + playerSeven);
			System.out.println("8  - " + playerEight);
			System.out.println("9  - " + playerNine);
			System.out.println("10 - " + playerTen);
			System.out.println("\n");
		}
		if (playerEight.equals(playerTwo) || playerEight.equals(playerThree) || playerEight.equals(playerFour) || playerEight.equals(playerFive) || playerEight.equals(playerSix) || playerEight.equals(playerSeven) || playerEight.equals(playerOne) || playerEight.equals(playerNine) || playerEight.equals(playerTen)) {
			playerEight = championRoster[numberGen()];
			System.out.println("\nTeam One - " + teamOne);
			System.out.println("1  - " + playerOne);
			System.out.println("2  - " + playerTwo);
			System.out.println("3  - " + playerThree);
			System.out.println("4  - " + playerFour);
			System.out.println("5  - " + playerFive);
			System.out.println("\nTeam Two - " + teamTwo);
			System.out.println("6  - " + playerSix);
			System.out.println("7  - " + playerSeven);
			System.out.println("8  - " + playerEight);
			System.out.println("9  - " + playerNine);
			System.out.println("10 - " + playerTen);
			System.out.println("\n");
		}
		if (playerNine.equals(playerTwo) || playerNine.equals(playerThree) || playerNine.equals(playerFour) || playerNine.equals(playerFive) || playerNine.equals(playerSix) || playerNine.equals(playerSeven) || playerNine.equals(playerEight) || playerNine.equals(playerOne) || playerNine.equals(playerTen)) {
			playerNine = championRoster[numberGen()];
			System.out.println("\nTeam One - " + teamOne);
			System.out.println("1  - " + playerOne);
			System.out.println("2  - " + playerTwo);
			System.out.println("3  - " + playerThree);
			System.out.println("4  - " + playerFour);
			System.out.println("5  - " + playerFive);
			System.out.println("\nTeam Two - " + teamTwo);
			System.out.println("6  - " + playerSix);
			System.out.println("7  - " + playerSeven);
			System.out.println("8  - " + playerEight);
			System.out.println("9  - " + playerNine);
			System.out.println("10 - " + playerTen);
			System.out.println("\n");
		}
		if (playerTen.equals(playerTwo) || playerTen.equals(playerThree) || playerTen.equals(playerFour) || playerTen.equals(playerFive) || playerTen.equals(playerSix) || playerTen.equals(playerSeven) || playerTen.equals(playerEight) || playerTen.equals(playerNine) || playerTen.equals(playerOne)) {
			playerTen = championRoster[numberGen()];
			System.out.println("\nTeam One - " + teamOne);
			System.out.println("1  - " + playerOne);
			System.out.println("2  - " + playerTwo);
			System.out.println("3  - " + playerThree);
			System.out.println("4  - " + playerFour);
			System.out.println("5  - " + playerFive);
			System.out.println("\nTeam Two - " + teamTwo);
			System.out.println("6  - " + playerSix);
			System.out.println("7  - " + playerSeven);
			System.out.println("8  - " + playerEight);
			System.out.println("9  - " + playerNine);
			System.out.println("10 - " + playerTen);
			System.out.println("\n");
		}
		int rerollNumber = input.nextInt();
		if(rerollNumber == 0){
			reroll = false;
		}
		if(rerollNumber == 1){
			playerOne = championRoster[numberGen()];
			teamOne++;
		}
		if(rerollNumber == 2){
			playerTwo = championRoster[numberGen()];
			teamOne++;
		}
		if(rerollNumber == 3){
			playerThree = championRoster[numberGen()];
			teamOne++;
		}
		if(rerollNumber == 4){
			playerFour = championRoster[numberGen()];
			teamOne++;
		}
		if(rerollNumber == 5){
			playerFive = championRoster[numberGen()];
			teamOne++;
		}
		if(rerollNumber == 6){
			playerSix = championRoster[numberGen()];
			teamTwo++;
		}
		if(rerollNumber == 7){
			playerSeven = championRoster[numberGen()];
			teamTwo++;
		}
		if(rerollNumber == 8){
			playerEight = championRoster[numberGen()];
			teamTwo++;
		}
		if(rerollNumber == 9){
			playerNine = championRoster[numberGen()];
			teamTwo++;
		}
		if(rerollNumber == 10){
			playerTen = championRoster[numberGen()];
			teamTwo++;
		}
	}
  }

  public static int numberGen() {
	return (int)Math.floor(Math.random()*(155-1+1)+1) - 1;
  }
}