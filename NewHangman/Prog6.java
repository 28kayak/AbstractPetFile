package NewHangman;

import java.util.Scanner;
public class Prog6{
	public static void main(String [] args){
		System.out.println("Welcome to hangman");
		Scanner scan = new Scanner(System.in);
		Hangman game = new Hangman();
		
		String again = "y";
 
		while ((again.compareTo("y") == 0)){
			if(game.newgame()){
				game.playing();
				System.out.println("Enter 'y' if you want to play hangman");
				again = scan.nextLine().toLowerCase();
			}else{
				System.out.println("You played 50 games good job!");
				break;
			}
		}//while
		System.out.println("Bye");
	}
}