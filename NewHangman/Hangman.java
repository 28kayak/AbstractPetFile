package NewHangman;

//import java.io.*;
import java.util.*;
public class Hangman
{
	private WordDatabase obj;
	private String answer;
	private int guessLeft;
	private StringBuilder correct;
	private StringBuilder guess;
	Scanner scan = new Scanner(System.in);
	
	public Hangman()
	{
		obj = new WordDatabase();
		answer = obj.next();
		guess = new StringBuilder();
	}
	//accessor methods
	public String getAnswer()
	{
		return answer;
	}
	public int getLeftChance()
	{
		return guessLeft;
	}
	public String getCurrentAnswer()
	{
		String currentAnswer;
		currentAnswer = correct.toString();
		return currentAnswer;
	}
	public String getGuess()
	{
		String guessing;
		guessing = guess.toString();
		return guessing;
	}
	
	
	
	public void newgame()
	{//re-initialize the (int)wrong guess so far
		
		try
		{
			answer = obj.next();
			correct = new StringBuilder();
			guess = new StringBuilder();
			System.out.println("the answer is "+answer);
			int newLength = answer.length() ;
			if(answer != null)
			{
				//System.out.println("while loop");
				
				for(int i=0; i<=newLength;i++)
				{
					//System.out.println("answer length = " + answer.length());
					//System.out.println("newLength = " + newLength);
					//System.out.println("i = " + i);
					correct.append("_ ");
					//System.out.println("After appending correct");
					//System.out.println("the answer is "+answer);
					//System.out.println("Current Ans = " + getCurrentAnswer());
				}
			}
		}catch(ArrayIndexOutOfBoundsException ie) 
		{
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
		System.out.println("Enter a letter: !");
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
		
	private void replaceCorrect(String correctLetter)
	{
			//correct = new StringBuilder();
			int wordIndex = answer.indexOf(correctLetter);//to get space between
			//System.out.println("In replaceCorrect word index = " + wordIndex);

			while(wordIndex >= 0)
			{
				System.out.println("wordIndex is greater than 0");
				correct.replace(wordIndex*2, wordIndex*2 + 1, correctLetter);
				wordIndex = answer.indexOf(correctLetter, wordIndex+1);//to get space between
			}
			guess.append(correctLetter);
			guess.append(" ");
			System.out.println("Letters you Guessed: " + guess);
	}
		
	private void replaceWrong(String wrongLetter)
	{
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
	private enum Status {checked, correctGuess, incorrectGuess, win, lose}
	
	public Status processGuess(String letter)
	{
		//guessLeft;
		//String letter;
		System.out.println("Playing new Game");
		
		//while(chance > 0)
		//{
			System.out.println("Current word: \n" + correct);
			//System.out.println("Current Answer: \n" + answer);
			//letter = getString();
			if(judge(letter) && !isChecked(letter))
			{
				System.out.println("Correct!!");
				replaceCorrect(letter);
				if(!isComplete())
				{
					System.out.println("correct but not complete yet");
					return Status.correctGuess;
				}
			} 
			else if(isChecked(letter))
			{
				System.out.println("You already guessed " + letter);
				return Status.checked;
			}
			else 
			{
				//chance--;
				System.out.println("Wrong!");
				guessLeft = getLeftChance() - 1;;
				replaceWrong(letter);
				return Status.incorrectGuess;
				//System.out.println("Wrong! You have "+chance+" guesses left.");
				
				//append guesses one, increment one to incorrect;
			}	
		//}//while
		if(guessLeft == 0)
		{
			System.out.println("You Lose!! The correct answer was '" + answer + "'");
			return Status.lose;
		} else 
		{
			System.out.println("You Win!!");
			return Status.win;
		}
	
	}//processGuess
	
	}
	

