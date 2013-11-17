package HW4;

//Cat will have a private instance variable for a indoor (boolean). 

/*include 2 constructors that include all the parameters in the Pet constructors as well as parameters for the subclass variable(s), 
* accessors for only the subclass' variables, 
* mutators for the subclass' variable, 
* override the convertYears method as described in 1. below, 
* override the speak method** as described in 2. below, 
* and toString method** 
* (which will include the info returned by its superclass' toString and the subclass' variable, 
* BUT NOT convertYears( ) value and NOT speak() value!)*/

/*
1.The convertYears method in both Cat and Dog must call the calcAge instance method in the superclass. 
In the Cat class, calculate and return (in a return statement) 
the equivalent human years using the rules:
1 cat year is 15 human years, 2 cat years is 24 human years, add 4 human years for every cat year over 2. 
In the Dog class, calculate and return (in a return statement)
the equivalent human years using the rules: 1 dog year is 9 human years, add 7 years for every year over 1. 
Make sure you return a "correct" value if the age is 0 (0 is Ok, but not a negative number).
*/
/*
2.The speak method returns:
Cat: "meow" if the Cat is an indoor cat, "MEOW" if the cat is NOT an indoor cat
Dog: "Woof" the number of times the numTricks has (for example if numTricks is 3, this returns "Woof Woof Woof" (put a space between each Woof)
-- In the toString (Pet, Cat and Dog) and speak (Dog) methods, in such a way that LESS GARBAGE is created (i.e., in these methods!)
*/




public class Cat extends Pet 
{

	private boolean indoor;
	
	
	public Cat(String name, int birthyear, boolean ind)
	{
		super(name,birthyear);
		setIndoor(ind);
		
	}
	public Cat()
	{
		super.name = "";
		super.birthyear = 0;
		indoor = true;
	}
	public void setIndoor(boolean ind)
	{
		indoor = ind;
	}
	public boolean getIndoor()
	{
		return indoor;
	}
	@Override
	int convertYears()
	{//1 cat year is 15 human years, 2 cat years is 24 human years, add 4 human years for every cat year over 2. 
		int convertedYear = 0;
		return convertedYear;
		
	}
	@Override
	String speak(){
		String speak;
		if(getIndoor())
		{//indoor cat
			speak = "meow";
		}
		else
		{
			speak = "MEOW";
		}
		return speak;

	}
	@Override
	public String toString()
	{
		String catData;
		catData = super.toString() + getIndoor();
		return catData;
	}
	
}
