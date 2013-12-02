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
			System.out.println("Enter next letter: ");
			letter = scan.nextLine();
			result = hangman.processGuess(letter);
		}while(result != Status.win||result != Status.lose);

		success = true;
		return success;
	}
	public void display()
	{
		if(playAGame())
		{//successfully can get win or lose
			if(result == Status.win)
			{
				System.out.println("You won!!");
				System.out.println("Answer: " + hangman.getAnswer());
				System.out.println("Guessed letters: " + hangman.getGuess());
			}
			else if(result ==  Status.lose)
			{
				System.out.println("You lose");
				System.out.println("Answer: " + hangman.getAnswer());
				System.out.println("Your Answer: " + hangman.getCurrentAnswer());
				System.out.println("Guessed letters" + hangman.getGuess());
				System.out.println("Try again!");
			}
			else
			{
				System.out.println("Thank you for playing");
			}
		}
	}
	

}//class
