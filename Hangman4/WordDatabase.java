package Hangman4;

/*Write a Java class (call it WordDatabase) which contains (note that each method below is an instance method-- NOT static):
-private instance array of Strings, assigned to the strings given in "ProgHW4- WordList" on Catalyst
-private instance variable for the current index (int)
-a default constructor (which calls the method to shuffle the String array)
-accessor for the array size
-method that returns the "current" string (string at the current index), 
	if the current index < array size, or null if current index == array size. 
	This method will increment the current index before returning.
-a public method that has NO PARAMETERS, that shuffles the array of Strings in the following manner
	: in a for loop (for index =0; index< array.length;++index) get a random index between 0 and array.length-1 (inclusive), 
	swap the array element at index with the array element at the random index. This method also sets the current index to 0.
-a public method that returns if there are more elements in the array (current index < array size)
	"returns true if there are more elements in the array (current index < array size), false otherwise".*/

public class WordDatabase {
	private String[] ProgHW4_WordList = {
			"achieve", "acoustics", "action", "activity", "afternoon", "apparel", 
			"appliance", "beginner", "boundary", "breakfast", "cabbage", "calculator", 
			"calendar", "caption", "carpenter", "channel", "creature", 
			"education", "feather", "friction", "guitar", "health", 
			"kitten", "language", "lawyer", "locket", "lumber", "mountain", 
			"partner", "passenger", "picture", "plastic", "pocket", "pollution", 
			"railway", "reward", "squirrel", "stranger", "sweater", "temper", 
			"territory", "texture", "thread", "treatment", "vacation", 
			"vegetable", "visitor", "volcano", "weather", "wilderness"
			};////private instance array of Strings, assigned to the strings given in "ProgHW4- WordList" on Catalyst
	
	private int current_index;//private instance variable for the current index (int)
	
	//a default constructor (which calls the method to shuffle the String array)
	public WordDatabase(){
		shuffle();
	}//constructor
	
	//accessor for the array size
	public int array_size(){ return ProgHW4_WordList[current_index].length();}//accessor
	
	//method that returns the "current" string (string at the current index), 
	//if the current index < array size, or null if current index == array size. 
	//This method will increment the current index before returning.
	public String current_string_returner(){
		if(checkMore()) {
			current_index++;
			return  ProgHW4_WordList[current_index];
			}
		else 
			return null;
	}//current_index_returner
	
	//a public method that has NO PARAMETERS, that shuffles the array of Strings in the following manner
	//in a for loop (for index =0; index< array.length;++index) get a random index between 0 and array.length-1 (inclusive), 
	//swap the array element at index with the array element at the random index. This method also sets the current index to 0.
	public void shuffle(){
		for(int i=0;i<ProgHW4_WordList.length;i++){
			int rand = (int)(Math.random() * (ProgHW4_WordList.length));
			String buffer = ProgHW4_WordList[i];
			ProgHW4_WordList[i] = ProgHW4_WordList[rand];
			ProgHW4_WordList[rand] = buffer;
		}
		current_index = 0;

	}//shuffle
	
	//-a public method that returns if there are more elements in the array (current index < array size)
	//"returns true if there are more elements in the array (current index < array size), false otherwise".
	public boolean checkMore(){
		if(current_index < array_size()) return true;
		return false;
	}
	
}
