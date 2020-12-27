package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;//generates random number
public class Main {

    public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  Random ran = new Random(); //Creates a new random number
	  int compScore = 0; //Score of Computer
	  int userScore = 0; //Score of User
	  int counter = 0;   // Round of the game

	  System.out.println("Hello, Enter your name:");
	  String name = scan.nextLine();
	  System.out.println("======================");

	  while(counter == 0){
	      int compChoice = 1 + ran.nextInt(3);
	      // 1 for Rock
          // 2 for paper
          // 3 for Scissor
          System.out.println("Hello "+name+" Enter 1 for Rock, 2 for Paper and 3 for Scissor");
          int userChoice = scan.nextInt(); // To take value from user

          if(userChoice == compChoice){
          	//If user and computer select same value then this part will execute
          	System.out.println("======================");
          	System.out.println("Its a tie, no point will awarded");
			  System.out.println("Computer:"+compScore);
			  System.out.println(name+":"+userScore);
          	System.out.println("======================");
		  }
          else if(userChoice == 1){
          	//If user choose Rock
          	if(compChoice == 2){
          		//If computer choose Paper
          		System.out.println("Computer selected Paper");
          		System.out.println("Sorry "+name+" You Lost this round!");
          		compScore++;
				System.out.println("======================");
          		System.out.println("Computer:"+compScore);
          		System.out.println(name+":"+userScore);
				System.out.println("======================");
			}else if(compChoice == 3){
          		//If computer choose Scissor
          		System.out.println("Computer selected Scissor");
          		System.out.println("Congrats "+name+" You won this round");
          		userScore++;
				System.out.println("======================");
          		System.out.println("Computer:"+compScore);
          		System.out.println(name+":"+userScore);
				System.out.println("======================");
			}

		  }
          else if(userChoice == 2){
          	//User choose paper
          	if(compChoice == 1){
          		//Computer choose Rock
          		System.out.println("Computer selected Rock");
          		System.out.println("Congrats "+name+" You won this round");
          		userScore++;
				System.out.println("======================");
          		System.out.println("Computer:"+compScore);
          		System.out.println(name+":"+userScore);
				System.out.println("======================");
			}else if(compChoice == 3){
          		//Computer choose Scissor
          		System.out.println("Computer selected Scissor");
          		System.out.println("Sorry "+name+" You lost this round");
          		compScore++;
				System.out.println("======================");
          		System.out.println("Computer:"+compScore);
          		System.out.println(name+":"+userScore);
				System.out.println("======================");
			}

		  }
          else if(userChoice == 3){
          	//User choose Scissor
          	if(compChoice == 1){
          		//Computer choose Rock
          		System.out.println("Computer selected Rock");
          		System.out.println("Sorry "+name+" you lost this round");
          		compScore++;
				System.out.println("======================");
          		System.out.println("Computer:"+compScore);
          		System.out.println(name+":"+userScore);
				System.out.println("======================");
			}else if(compChoice == 2){
          		//Computer choose paper
          		System.out.println("Computer selected Paper");
          		System.out.println("Congrats "+name+" you won this round");
          		userScore++;
				System.out.println("======================");
          		System.out.println("Computer:"+compScore);
          		System.out.println(name+":"+userScore);
				System.out.println("======================");
			}

		  }
          if(userScore == 3){
          	//If user won the game
          	System.out.println("YOU WON THIS GAME!!! CONGRATS");
          	counter++; //Using counter++ to exit while loop
		  }
          if(compScore == 3){
          	// If computer won the game
          	System.out.println("Sorry "+name+" you lost this game");
          	counter++; //Using counter++ to exit while loop
		  }


      }


    }
}
