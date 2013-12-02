package NewHangman;

import java.io.*;
import java.util.*;

/*The WordDatabase must implement Interface<String> and include the following (changes are below):
- private instance ArrayList of Strings
- REMOVE the private instance variable for the current index (int)
- private instance Iterator<String>
- a default constructor (which calls a method to read into the ArrayList from a text file,
 then calls the method to shuffle the String ArrayList, And assigns the instance ArrayList's iterator to the instance Iterator)
- accessor for the ArrayList size
- Replace the method that returns the "current" string with next() (override of the Iterator method),
and now all you return is your instance Iterator variable's next().
- a private method to read from a text file(may hard-code or use a private instance filename String)
all the Strings from a text file into the ArrayList instance variable(use the input file on Catalist)
- a public method that has NO PARAMETERS, that shuffles the ArrayList of Strings in the following manner:
 in a for loop (for index =0; index< array.length;++index) get a random index between 0 and array.length-1 (inclusive), 
 swap the array element at index with the array element at the random index. This method also sets the current index to 0. 
 Note that you CAN'T use the [] operator on ArrayList elements, AND you're not allowed to convert the ArrayList into an array!
- Replace the method that returns if there are more elements in the array with hasNext() (override the other Iterator method)
and now all you return is your instance ListIterator variable's hasNext(). 
- override void remove(), but do nothing in it
NOTE: YOU ARE NOT ALLOWED TO CONVERT THE ArrayList INTO AN ARRAY!!!!
*/
public class WordDatabase implements Interface<String>
{
	private ArrayList<String> al = new ArrayList<String>();//private instance ArrayList of String
	private Iterator<String> ite;
	
	public WordDatabase()
	{
		read();
		
	}//default constructor
	
	public int array_size()
	{ 
		return al.size();
	}
	
	public String current_string_returner()
	{
		shuffle();
		if(checkMore()) 
		{
			return  ite.next();
		}
		else 
			return null;
	}//end current_index_returner
	
	public void shuffle()
	{
		Collections.shuffle(al);
		
	}//end shuffle
	
	public boolean checkMore()
	{
		ite = al.iterator();
		if(ite.hasNext()) 
		{
			return true;
		}
		return false;
	}
	
	private void read()
	{
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader("ProgHW6-InputFile.txt"));
			String line1;
			while ((line1 = br.readLine()) != null)
			{ //read the row
				al.add(line1); // ArrayListÇ…çsÇäiî[
				//System.out.println(line1);
			}
			br.close();
		
		}catch (IOException ie)
		{
			ie.printStackTrace();
			System.exit(101);
		}
	}//end read
}//end/ class
