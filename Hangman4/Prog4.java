package Hangman4;

///////////////////////////////////////////////////////////////
//Programming Assignment4
//Haruki Taguchi
//11/10/2013
//mac, eclipse
//this is a game called hangman.
//enter a gueesed letter, and check if it is right or not
//if right, the correct letter fills into the answer(not visualized)
//if wrong, 6times allowed
//See UML.
///////////////////////////////////////////////////////////////


/*Write a Java application program in which main is in a separate class and file from the WordDatabase 
* and Hangman classes (I'm calling it Prog4). In main, declare a Hangman object variable, instantiate it 
* (ONLY ONCE FOR THE WHOLE PROGRAM), then in a loop, allow the user to play several games of Hangman. 
* Stop the loop when the user doesn't want to play, or until the Hangman game won't initialize.
Note: Do not declare any class-scope variables in the main (Prog4) class 
except the Scanner object for System.in. 
You may use the Scanner class a nextLine() method OR use JOptionPane's methods (as shown in the textbook). 
EACH String and StringBuilder method MUST use the length method, 
NOT A HARD-CODED NUMBER nor a variable for the size !
DO NOT traverse a String or StringBuilder (except to
string to spaces or '_', and to display with spaces between chars). 
Instead use String and StringBuilder methods for searching for and replacing chars!!!*/
import java.util.Scanner;
public class Prog4
{
	public static void main(String [] args)
	{
		System.out.println("Welcome to hangman");
		Scanner scan = new Scanner(System.in);
		Hangman game = new Hangman();

		String again = "y";

		while ((again.compareTo("y") == 0))
		{
			if(game.newgame())
			{
				game.playing();
				System.out.println("Enter 'y' if you want to play hangman");
				again = scan.nextLine().toLowerCase();
			}else
			{
				System.out.println("You played 50 games good job!");
				break;
			}
		}//while
		System.out.println("Bye");
	}//main
}//class

//test runs for the programming Assignment4//

/*Welcome to hangman
Playing new Game
Current word: 
_ _ _ _ _ _ 
Enter a letter: 
e
Letters you Guessed: e 
Current word: 
_ _ _ _ e _ 
Enter a letter: 
a
Letters you Guessed: e a 
Wrong! You have 5 guesses left.
Current word: 
_ _ _ _ e _ 
Enter a letter: 
i
Letters you Guessed: e a i 
Wrong! You have 4 guesses left.
Current word: 
_ _ _ _ e _ 
Enter a letter: 
e
You already guessed e
Current word: 
_ _ _ _ e _ 
Enter a letter: 
h
Letters you Guessed: e a i h 
Wrong! You have 3 guesses left.
Current word: 
_ _ _ _ e _ 
Enter a letter: 
i
You already guessed i
Current word: 
_ _ _ _ e _ 
Enter a letter: 
c
Letters you Guessed: e a i h c 
Wrong! You have 2 guesses left.
Current word: 
_ _ _ _ e _ 
Enter a letter: 
s
Letters you Guessed: e a i h c s 
Wrong! You have 1 guesses left.
Current word: 
_ _ _ _ e _ 
Enter a letter: 
;
Letters you Guessed: e a i h c s ; 
Wrong! You have 0 guesses left.
You Lose!! The correct answer was 'lumber'
Enter 'y' if you want to play hangman
y
Playing new Game
Current word: 
_ _ _ _ _ _ _ _ _ 
Enter a letter: 
e
Letters you Guessed: e 
Current word: 
_ _ _ e _ _ _ _ _ 
Enter a letter: 
a
Letters you Guessed: e a 
Current word: 
a _ _ e _ _ _ _ _ 
Enter a letter: 
o
Letters you Guessed: e a o 
Current word: 
a _ _ e _ _ o o _ 
Enter a letter: 
f
Letters you Guessed: e a o f 
Current word: 
a f _ e _ _ o o _ 
Enter a letter: 
t
Letters you Guessed: e a o f t 
Current word: 
a f t e _ _ o o _ 
Enter a letter: 
r
Letters you Guessed: e a o f t r 
Current word: 
a f t e r _ o o _ 
Enter a letter: 
n
Letters you Guessed: e a o f t r n 
You Win!!
Enter 'y' if you want to play hangman

*/
