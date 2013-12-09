package LastHW;

import java.util.*;
public abstract class Pet implements Comparable<Pet>
{
        protected String name; //maybe need to declare as a private variable
        protected int birthyear;//same here
        
//Two constructors (one with a String and an int which calls the mutators, one default)
        public Pet(String str, int d)
        {
                name = setName(str);
                birthyear = setBirthyear(d);   
        }//constructor_1
        
        public Pet()
        {
                name = "";
                birthyear = 0;
        }//constructor_2
        
//accessor methods, one for each instance variable (and have NO PARAMETERS)
//getMethod or accessor method is to access class variable, 
//so need not to create another variable.

        public String getName()
        {
        	return name;
        }
        
        public int getBirthyear()
        { 
        	return birthyear;
        }
        
//mutator methods, one each for each variable, but each must check if the parameter is invalid 
//(if String, not null and has length>0, if int, birthyear >=1970 and <= current year), 
//but don't change instance variable if invalid!
        public String setName(String nam)
        {
                if( nam.length() > 0 || nam != null)
                {
                	this.name = nam;//here, name = nam is enough because name imply this.name, so essentially same. 
                }
                	return this.name;
        }
        
        public int setBirthyear(int bir)
        {
                Calendar cal = new GregorianCalendar();
                int currentyear = cal.get(Calendar.YEAR);
                	if(bir >=1970 && bir<=currentyear)
                	{
                		this.birthyear = bir;
                	}
                return this.birthyear;
        }
        
//a method called calcAge( ) (NO PARAMETERS) which returns in a return statement this Pet's age 
//(current year - birthyear) (use GregorianCalendar class to get the current year-- see next p.)
//In calcAge, instantiate a GregorianCalendar object (include java.util.*) using its default constructor, 
//then call the get method on the object, passing Calendar.YEAR.
        public int calcAge()
        {
                Calendar cal = new GregorianCalendar();
                int currentyear = cal.get(Calendar.YEAR);
                return (currentyear - birthyear);
        }
        static void print(Pet[] pets)
    	{
    		/*for(int index = 0; index < pets.length; index++)
    		{
    			System.out.println(pets[index].toString() 
    			+"\nHuman Years = "+ pets[index].convertYears()
    			+", Says " +pets[index].speak());
    		}
    		//System.out.println("There is/are"+count+"indoor cat(s)");
    		 
    		 */
    	}
        @Override
        public int compareTo(Pet aPet)
        {
        	int specifiedStr;
        	specifiedStr = name.compareToIgnoreCase(aPet.name);
        	if(specifiedStr > 0)
        	{
        		
        	}
        	else if(specifiedStr == 0)
        	{
        		
        	}
        	else 
        	{
        		
        	}
        	return 0;
        }
        
        
//an abstract method called convertYears( ) which returns an int (and has NO PARAMETERS)
        abstract int convertYears();
//an abstract method called speak( ) which returns a String (and has NO PARAMETERS)
        abstract String speak();
//toString method** (overriding Object's toString for the name of the class, each variable name and their values
        public String toString(){ return "Name=" + getName() + ", Birth year=" +getBirthyear();}
}//end superclass Pet