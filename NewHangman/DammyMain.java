package NewHangman;

public class DammyMain 
{
	public static void main(String [] args)
	{
		//WordDatabase data = new WordDatabase();
		//data.read();
		//data.shuffle();
		Hangman hangman = new Hangman();
		String answer = hangman.getAnswer();
		System.out.println("answer = " + answer);
		
	}

}
