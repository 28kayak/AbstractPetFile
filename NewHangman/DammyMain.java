package NewHangman;

import NewHangman.Hangman.Status;
import java.util.Scanner;
public class DammyMain 
{
	public static void main(String [] args)
	{
		//WordDatabase data = new WordDatabase();
		//data.read();
		//data.shuffle();
		String[] letters
			={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		System.out.println("Let's hangman!");
		Hangman hangman = new Hangman();
		String answer = hangman.getAnswer();
		//System.out.println("answer = " + answer);
		hangman.newgame();
		int index = 0;
		int chance;
		String aletter;
		chance = hangman.getLeftChance();
		Scanner scan = new Scanner(System.in);
		NewHangman.Hangman.Status resultant = Status.inprogress;
		/*do
		{
			System.out.println("Enter a letter: ");
			aletter = scan.nextLine();
			resultant = hangman.processGuess(aletter);
			chance = hangman.getLeftChance();
			System.out.println("resultant " + resultant);
			index++;
		}while(resultant != Status.win&&resultant != Status.lose);
		/*if(index == letters.length)
		{
			System.out.println("challenged All Letters");
		}
		else if(resultant == Status.lose)
		{
			System.out.println("----LOSE----");
		}
		else if(resultant == Status.win)
		{
			System.out.println("---WIN----");
		}
		else
		{
			System.out.println("Done by other ways");
		}
		*/	
		/**
		
		ConsoleHangmanGame consoleHangman = new ConsoleHangmanGame();
		System.out.println("--------Start playing----------");
		consoleHangman.playAGame();
		
		System.out.println("--------display-------------");
		consoleHangman.display();
		//System.out.println("After display");
		
		*/
		
	}

}
