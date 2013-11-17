package HW4;

//Dog will have a private instance variable for # of tricks (int). 

/*include 2 constructors that include all the parameters in the Pet constructors as well as parameters for the subclass variable(s), 
* accessors for only the subclass' variables, mutators for the subclass' variable, override the convertYears method as described in 1. 
* below, override the speak method** as described in 2. below, and toString method** 
* (which will include the info returned by its superclass' toString and the subclass' variable, 
* BUT NOT convertYears( ) value and NOT speak() value!)*/
public class Dog extends Pet 
{
	 private int tricks;
	 public Dog(String name, int birthyear, int tricks)
	 {
		 super(name, birthyear);
	 }
	 
	 
	 
	 
	 @Override
	 public String toString()
	 {
		 return super.toString();
	 }




	@Override
	int convertYears() {
		// TODO Auto-generated method stub
		return 0;
	}




	@Override
	String speak() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
