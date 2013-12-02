package NewHangman;

import java.io.*;
import java.util.*;
public class Hangman {
	private WordDatabase obj;
	private String answer;
	private int guseeLeft;
	private StringBuilder correct;
	private StringBuilder guess;
	Scanner scan = new Scanner(System.in);
	
	public Hangman(){
		obj = new WordDatabase();
		answer = obj.current_string_returner();
		guess = new StringBuilder();
	}
	
	public void newgame(){//re-initialize the (int)wrong guess so far
		
		try{
		answer = obj.current_string_returner();
		correct = new StringBuilder();
		guess = new StringBuilder();
		System.out.println("the answer is "+answer);
		
		while(answer != null){
			for(int i=0; i<answer.length();i++){
				correct.append("_ ");
			}
		}
		}catch(ArrayIndexOutOfBoundsException ie) {
			ie.printStackTrace();
			System.exit(101);
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
	
/*a public instance method which tries to "process" the char (guess)
parameter, but returns 0 if the char was already guessed 
(see if it's in the player's char guesses StringBuilder the same way you did in Prog.HW#4***). 
Processing the guess char includes appending it to the char guesses StringBuilder, 
and updating the player's correct answer as done in Prog. HW#4, 
OR updating how many wrong guesses are left if not in the answer String. Have the function some status info, 
for example, 
1 if guessedcorrectly, but hasn't completed the answer word, -1 if guessed incorrectly, 
2 if got the whole answer, -2 if ran out of guesses. If using an int status,
declare public static final int variables or enum type.*/
	
	public int process(char gue){
		
		
		return 0;
	}
	
	}
	

