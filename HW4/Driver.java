package HW4;

/*In a separate file, write a driver class (includes main). In main, declare an array of Pet objects, then do call the following static methods:
- a method that returns (in a return statement) an array of Pet objects. In this method, read the size of array from the user, (don't allow < 1 or > 50)* allocate memory for the array, the assign to each element the return value from a static method that reads and PARSES the input (in another method, see A. below).
- a method to sort the array by name (be sure to use the length variable of the array), using the String class' compareToIgnoreCase method.
- a method that prints each object's toString AND the return value from convertYears AND return value from speak in an enhanced for loop. THERE ARE NO IF STATEMENTS NOR CONDITION/TERNARY OPERATORS IN THIS METHOD!
- a method to return how many Cats in the array (if any) are indoor Cats (described in B. below)
- If the return value is >= 0, print the how many cats are indoor cats, or if it is -1, print "No cats".
A.In the method that reads and parses the input, read into a String, tokenize (using a StringTokenizer or split method in the String class),
  convert the tokens into the expected types based on whether it's a Dog or Cat,
  and return an instance of Dog or Cat based on the tokens (converted if needed, could use Integer.parseInt(str) and Boolean.parseBoolean(str)). 
  See examples of input on Catalyst.
 B.In the method that finds how many Pets in the array are indoor cats,
  traverse the array USING A LOOP and USING THE instanceof operator in the proper place. 
  Return the number of Pets in the array that are indoor cats, but return -1 if there are NO cats. 
  You'll need a separate variable to indicate if there are any cats.
  You'll need to use the cast operator in this method.
  DON'T PRINT IN THIS METHOD.




*/
import java.util.Scanner;
public class Driver
{
	//static Scanner scan = new Scanner(System.in);
	public static void main(String [] args)
	{
		//Pet cat = new Cat();
		
	}
	//a method that returns (in a return statement) an array of Pet objects. 
	//In this method, read the size of array from the user, (don't allow < 1 or > 50)*
	//allocate memory for the array, the assign to each element the return value from a static method that reads and PARSES the input (in another method, see A. below).
	public static Pet[] createArray()
	{
		Pet[] pets;
		Scanner scan = new Scanner(System.in);
		int indexNum = scan.nextInt();
		if(indexNum < 1 || indexNum > 50)
		{
			//System.out.println("invalid number");
			pets = new Pet[10];
			//ask your prof about the numbers of index in the case user types invalid num.
		}
		else
		{
			pets = new Pet[indexNum];
		}
		
		return pets;
	}//createArray
	/* //a method to sort the array by name (be sure to use the length variable of the array), 
	//using the String class' compareToIgnoreCase method.
	public static void sortByName(Pet[] pets)
	{
		
	}
	public static int partition(Comparable[] array, int begin, int last)
	{//this method belongs to the method sortBy
		
	}
	*/
	 //a method that prints each object's toString AND the return value from convertYears
	 //AND return value from speak in an enhanced for loop. 
	 //THERE ARE NO IF STATEMENTS NOR CONDITION/TERNARY OPERATORS IN THIS METHOD!
	static void prints(Pet[] pets)
	{
		for(int index = 0; index < pets.length; index++)
		{
			System.out.println("Pet:" + pets[index].getClass()
					+"Name: " + pets[index].getName() 
					+"Age in human" + pets[index].convertYears()
					+"Speak: " +pets[index].speak());
		}
	}
	static int countCat(Pet[] pets)
	{
		int indCats = 0;
		for(int index = 0; index < pets.length; index++)
		{
			if(pets[index] instanceof Cat)
			{
				boolean ind = pets[index].getIndoor();
			}
			
		}
		
		
		
		
		return indCats;
		
	}

}
