package NewHangman;

import NewHangman.Hangman.Status;
import java.util.Scanner;

public class ConsoleHangmanGame
{
	private Hangman hangman;
	private Scanner scan = new Scanner(System.in);
	Status result;
	
	ConsoleHangmanGame()
	{
		hangman = new Hangman();
	}
	public boolean playAGame()
	{
		boolean success = false;
		String letter;
		try
		{
			hangman.newgame();
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			 return success = false;
		}
		do
		{
			//System.out.println("do-while");
			System.out.println("To quit, type -1");
			System.out.println("Enter next letter: ");
			letter = scan.nextLine();
			if(letter.matches("[a-z]")||letter.matches("[A-Z]"))
			{
				result = hangman.processGuess(letter);
			}
			else
			{
				System.out.println("---type a letter---");
			}
			System.out.println("result = " + result);
		}while(result != Status.win && result != Status.lose && !letter.equals("-1"));

		success = true;
		return success;
	}
	public void display()
	{
		System.out.println("--------display---------");
		if(hangman.getStatus() == Status.win)
		{
			System.out.println("You won!!");
			System.out.println("Answer: " + hangman.getAnswer());
			System.out.println("Guessed letters: " + hangman.getGuess());
			System.out.println("Good Job!");
		}
		else if(hangman.getStatus() == Status.lose)
		{
			System.out.println("You lose");
			System.out.println("Answer: " + hangman.getAnswer());
			System.out.println("Your Answer: " + hangman.getCurrentAnswer());
			System.out.println("Guessed letters" + hangman.getGuess());
			System.out.println("Try again!");
		}
		else
		{
			System.out.println("Others");
		}
	}//display
	

}//class
