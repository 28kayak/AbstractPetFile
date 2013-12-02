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
-a public method that returns if there are more elements in the array (current index < array size)*/
public class WordDatabase {

	private String[] ProgHW4_WordList;
	private int current_index;
	
	public WordDatabase(){
		shuffle(ProgHW4_WordList);
	}//constructor
	
	public int array_size(){ return ProgHW4_WordList[current_index].length();}//accessor
	
	public String[] current_index_returner(){
		String[] currentString = new String[current_index]; //[][][][][][][]
		if(current_index <= currentString[current_index].length())
			currentString = new String[current_index];
		return currentString;
	}//current_index_returner
	
	public void shuffle(String wordlist){
		/*in a for loop (for index =0; index< array.length;++index) get a random index between 0 and array.length-1 (inclusive), 
	swap the array element at index with the array element at the random index. This method also sets the current index to 0.*/
		for(int i=0; i<wordlist.length(); ++i){
			i = (int)(Math.random() * ((wordlist.length()-1)-0));
			
		}//for
	}//shuffle
	
}
