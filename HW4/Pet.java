package HW4;

import java.util.*;
public abstract class Pet 
{
	
	protected String name = "";
	protected int birthyear = 0;
	
//Two constructors (one with a String and an int which calls the mutators, one default)
	public Pet(String str, int d)
	{
		
	}//constructor_1
	
	public Pet()
	{
		name = "";
		
		
	}//constructor_2
	
//accessor methods, one for each instance variable (and have NO PARAMETERS)
	public String getName(){ 
		String nam = name;
		return nam;
		}
	public int getBirthyear(){
		int bir = birthyear;
		return bir;
		}
	
//mutator methods, one each for each variable, but each must check if the parameter is invalid 
	//(if String, not null and has length>0, if int, birthyear >=1970 and <= current year), 
	//but don't change instance variable if invalid!
	public String setName(String nam){
		if(nam != null || nam.length() > 0){
		this.name = nam;
		}
		return this.name;
		}
	public int setBirthyear(int bir){
		Calendar cal = new GregorianCalendar();
		int currentyear = cal.get(Calendar.YEAR);
		if(bir >=1970 && bir<=currentyear){
		this.birthyear = bir;
		}
		return this.birthyear;
		}
	
//a method called calcAge( ) (NO PARAMETERS) which returns in a return statement this Pet's age 
//(current year - birthyear) (use GregorianCalendar class to get the current year-- see next p.)
//In calcAge, instantiate a GregorianCalendar object (include java.util.*) using its default constructor, 
//then call the get method on the object, passing Calendar.YEAR.
	public int calcAge(){
		Calendar cal = new GregorianCalendar();
		int currentyear = cal.get(Calendar.YEAR);
		return (currentyear - birthyear);
	}
	
	
//an abstract method called convertYears( ) which returns an int (and has NO PARAMETERS)
	abstract int convertYears();
//an abstract method called speak( ) which returns a String (and has NO PARAMETERS)
	abstract String speak();
//toString method** (overriding Object's toString for the name of the class, each variable name and their values
	public String toString(){ return getName()+getBirthyear();}
}//end superclass Pet
