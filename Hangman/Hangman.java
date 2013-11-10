/*Write a Java class (call it Hangman) which contains (note that each method below is an instance method-- NOT static):
!private instance WordDatabase object variable
!private instance String (for the current "answer")
!private (instance) StringBuilder for the player's string of correct answers (see below of what that should look like)
!private instance StringBuilder for the player's char guesses (in the order guessed, whether correct or not)

!a default constructor (initialize the WordDatabase object to a new WordDatabase)
-a public instance method for initializing for a new game (gets the next String from the WordDatabase*, 
	clears the StringBuilder** with the char guesses, and sets the StringBuilder** for the player's correct answers to all spaces 
	(only for the number of chars in the current answer). Return true.
 *if the WordDatabase runs out of words, return false
 **NEVER ASSIGN A new StringBuilder (except in the constructor or its declaration), BUT JUST CHANGE THE CHARS IN IT (OR POINTS OFF)!

- a public instance method for playing hangman: 
the player has up to 6 incorrect guesses to guess all the letters in a word before he/she "dies". 
The word is shown as all '_' (actually, display underscore '_' and a space between). 
Each time the user guesses a letter that is in the word, that letter will replace a space 
in the correct locations in the player's correct answer. (convert their input to lowercase). 
Don't allow the user to guess a letter he/she already guesses, and tell the user 
how many more guesses he/she has before the user "dies" after each guess. 
MAKE SURE YOU USE THE INSTANCE VARIABLES IN THE GAME! 
(Note: you should write private methods called from this method so this method doesn't get too long!)*/
import java.util.Scanner;
public class Hangman {
	private WordDatabase obj;//private instance WordDatabase object variable
	private String answer;//private instance String (for the current "answer")
	private StringBuilder correct;//private (instance) StringBuilder for the player's string of correct answers
	private StringBuilder guess;//private instance StringBuilder for the player's char guesses
	Scanner scan = new Scanner(System.in);
	//default constructor (initialize the WordDatabase object to a new WordDatabase)
	public Hangman(){
		
		obj = new WordDatabase();
		answer = obj.current_index_returner();
		guess.equals(" ");
		correct.equals(" ");
		
	}//constructor
	
	//a public instance method for initializing for a new game (gets the next String from the WordDatabase*, 
	//clears the StringBuilder** with the char guesses, and sets the StringBuilder** for the player's correct answers to all spaces 
	//(only for the number of chars in the current answer). Return true.
	public boolean newgame()
	{
		answer = obj.current_index_returner();
		
		guess.equals("");
		for(int i=0; i<answer.length();i++){
			correct.append(" ");
		}
		playing();
		return true;
	}
	
	
/* a public instance method for playing hangman: 
the player has up to 6 incorrect guesses to guess all the letters in a word before he/she "dies". 
The word is shown as all '_' (actually, display underscore '_' and a space between). 
Each time the user guesses a letter that is in the word, that letter will replace a space 
in the correct locations in the player's correct answer. (convert their input to lowercase). 
Don't allow the user to guess a letter he/she already guesses, and tell the user 
how many more guesses he/she has before the user "dies" after each guess. 
MAKE SURE YOU USE THE INSTANCE VARIABLES IN THE GAME! 
(Note: you should write private methods called from this method so this method doesn't get too long!)*/
	public void playing()
	{
		int chance = 6;
		String letter = getString();
		if(judge(letter)&&!isChecked(letter))
		{
			replaceCorrect(letter);
		}
		else
		{
			chance--;
			
			//append guesses one, increment one to incorrect;
		}
		
		
		
		
		
	}
	
	private boolean judge(String guessedLetter)
	{
		//int chance = 6;
		boolean judgement;
		if(answer.contains(guessedLetter))
		{
			judgement = true;
		}
		else
		{	
			judgement = false;
		}
		
	}
	private String getString()
	{
		String aletter = scan.nextLine();
		return aletter;
	}
	private StringBuilder replaceCorrect(String correctLetter)
	{
		int wordIndex = answer.indexOf(correctLetter);
		correct.append(wordIndex);
		
		
		
	}
	private StringBuilder repalceIncorrect(String wrongLetter)
	{
		guess.append(wrongLetter);
	}
	private boolean isChecked(String unchecked)
	{ 
		String checkedLetter; 
		checkedLetter = guess.toString();
		if(checkedLetter.contains(unchecked))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		
		
		
	}
	
}
