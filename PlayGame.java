package com.RPSGame;
import java.util.Random;
import java.util.Scanner;

public class PlayGame {
	public static void main(String[] args) {
		//r for Rock
		//p for paper
		//s for Scissor
		String[] rps = {"r", "p", "s"};
		Scanner sc = new Scanner(System.in);
		String playerMove;
		String computerMove;
		
		while(true) {
			System.out.println("Please enter your move: ");
			playerMove = sc.next();
			computerMove = rps[new Random().nextInt(rps.length)];
			System.out.println("ComputerMove is" +computerMove);
			if(playerMove.equals(computerMove)) {
				System.out.println("The Game is Draw!");
			}else if(playerMove.equals("r")) {
				if(computerMove.equals("s")) {
					System.out.println("You lose the game");
				}else if(computerMove.equals("p")) {
					System.out.println("You win the game");
				}
			}else if(playerMove.equals("p")) {
				if(computerMove.equals("s")) {
					System.out.println("You lose the game");
				} else if(computerMove.equals("r")) {
					System.out.println("You win the game");
				}
			}else if(playerMove.equals("s")) {
				if(computerMove.equals("r")){
					System.out.println("You lose the game");
				}else if(computerMove.equals("p")){
					System.out.println("You win the game");
				}
			}
			System.out.println("***The Game is Over***");
			System.out.println("Play Again");
		}
			
			
	}
	
}

	


