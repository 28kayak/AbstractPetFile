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
public class Main
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		Hangman game = new Hangman();
		String again;
		again = scan.nextLine();
		if(again.equalsIgnoreCase("y"))
		{
			game.newgame();
			game.playing();
			
		}
		else
		{
			System.out.println("Thank you for using.");
		}
		
	}
}
