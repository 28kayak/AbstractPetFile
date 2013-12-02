package Hangman4;/*Write a Java class (call it Hangman) which contains (note that each method below is an instance method-- NOT static):
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
		answer = obj.current_string_returner();
		guess = new StringBuilder();
	}//constructor
	
	//a public instance method for initializing for a new game (gets the next String from the WordDatabase*, 
	//clears the StringBuilder** with the char guesses, and sets the StringBuilder** for the player's correct answers to all spaces 
	//(only for the number of chars in the current answer). Return true.
	public boolean newgame(){
		answer = obj.current_string_returner();
		correct = new StringBuilder();
		guess = new StringBuilder();
		if(answer != null){
			for(int i=0; i<answer.length();i++){
				correct.append("_ ");
			}
			return true;
		}
		return false;
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
	public void playing(){
		int chance = 6;
		String letter;
		System.out.println("Playing new Game");
		while(chance > 0){
			System.out.println("Current word: \n" + correct);
			//System.out.println("Current Answer: \n" + answer);
			letter = getString();
			if(judge(letter) && !isChecked(letter)){
				//System.out.println("Correct!!");
				replaceCorrect(letter);
				if(isComplete()){
					break;
				}
			} 
			else if(isChecked(letter)){
				System.out.println("You already guessed " + letter);
			}
			else {
				chance--;
				replaceWrong(letter);
				System.out.println("Wrong! You have "+chance+" guesses left.");
				
				//append guesses one, increment one to incorrect;
			}	
		}//while
		if(chance == 0){
			System.out.println("You Lose!! The correct answer was '" + answer + "'");
		} else {
			System.out.println("You Win!!");
		}
	}
	
	private boolean isComplete() {
		return (answer.compareTo(correct.toString().replace(" ", "")) == 0);//replace(' ', '')
	}

	private boolean judge(String guessedLetter){
		boolean judgement;
		if(answer.contains(guessedLetter)){
			judgement = true;
		}
		else judgement = false;
		return judgement;
	}
	
	private String getString(){
		//todo check to see it its one letter other wise err
		System.out.println("Enter a letter: ");
		String aletter = scan.nextLine().toLowerCase();
		return aletter;
	}
	
	private boolean isChecked(String unchecked){ 
		String checkedLetter; 
		checkedLetter = guess.toString();
		if(checkedLetter.contains(unchecked)){
			return true;
		}
		else{
			return false;
		}
	}
		
		private void replaceCorrect(String correctLetter){
			int wordIndex = answer.indexOf(correctLetter);//to get space between

			while(wordIndex >= 0){
				correct.replace(wordIndex*2, wordIndex*2 + 1, correctLetter);
				wordIndex = answer.indexOf(correctLetter, wordIndex+1);//to get space between
			}
			guess.append(correctLetter);
			guess.append(" ");
			System.out.println("Letters you Guessed: " + guess);
		}
		
		private void replaceWrong(String wrongLetter){
			guess.append(wrongLetter);
			guess.append(" ");
			System.out.println("Letters you Guessed: " + guess);
		}
	}
	



