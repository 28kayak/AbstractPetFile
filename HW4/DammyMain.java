package HW4;
/*
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
public class DammyMain 
{
	static Scanner intscan = new Scanner(System.in);
	static Scanner stringscan = new Scanner(System.in);
	static Pet[] alist;
	public static void main(String[] args) 
	{
		/*
		Pet[] pets = new Pet[5];
		pets[0] = new Cat("Mike",2011,true);
		pets[1] = new Dog("Pochi",2000,5);
		pets[2] = new Cat("Tama",1990,false);
		pets[3] = new Cat("Sushi",2013, true);
		pets[4] = new Dog("Hachi",1999,55);
		
		
		*/
		createPetList();
		printList();
	}
	public static Pet[] createPetList()
	{
		//String name, byear, data;
		System.out.println("Enter number of indexes in your list");
		int listNum = intscan.nextInt();
		
		alist = new Pet[listNum];
		for(int index = 0; index < alist.length ;index++)
		{
			alist[index] = readInfo();
		}
		return alist;

	}
	
	
	public static Pet readInfo()
	{
		
		String name;
		int byear; 
		String other;
		String type;
		System.out.println("Enter animal type Dog or Cat");
		type = stringscan.nextLine();
		System.out.println("Enter pet's name: ");
		name = stringscan.nextLine();
		System.out.println("Enter his/her birth year: ");
		byear = intscan.nextInt();
		
		if(type.equalsIgnoreCase("Cat"))
		{//Need to think how do you determine which class is provided by a user.
			System.out.println("Is your cat indoor? Type Y for yes, otherwise N");
			other = stringscan.nextLine();
			if(other.equalsIgnoreCase("Y"))
			{
				other = "true";
			}
			else
			{
				other = "false";
			}
			return new Cat(name, byear, Boolean.valueOf(other)); 
		}
		else if(type.equalsIgnoreCase("Dog"))
		{//inu naraba 
			System.out.println("How many tricks does the dag have?");
			other = stringscan.nextLine();
			return new Dog(name, byear, Integer.valueOf(other) );
		}
		else
		{
			System.out.println("Invalid Animal Type");
			return null;
		}
	}
	public static void printList()
	{
		for(int index = 0; index < alist.length; index++)
		{
			System.out.println(alist[index].toString());
		}
	}

}
