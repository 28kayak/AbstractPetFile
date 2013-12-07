package LastHW;

public class Cat extends Pet {
    private boolean indoor;//Cat will have a private instance variable for a indoor (boolean).
            
    //include 2 constructors that include all the parameters in the Pet constructors as well as parameters for the subclass variable(s),
    public Cat(String name, int birthyear, boolean ind){
            super(name,birthyear);//call superclass's constructor 
            setIndoor(ind);//set if cat is indoor or not separately      
    }
    
    public Cat(){
            super.name = "";//if you change name in superclass to private, you need to edit as set(name).
            super.birthyear = 0;//same here 
            //super.name point name of superclass, so that you do not need to re-define name in cat class(subclass)
            indoor = true;
    }

    public boolean getIndoor(){ return indoor; }//accessors for only the subclass' variables, 
    public void setIndoor(boolean ind){ indoor = ind; }//mutators for the subclass' variable, 
    
    /*
    1.The convertYears method in both Cat and Dog must call the calcAge instance method in the superclass. 
    In the Cat class, calculate and return (in a return statement) 
    the equivalent human years using the rules:
    1 cat year is 15 human years, 2 cat years is 24 human years, add 4 human years for every cat year over 2. 
    Make sure you return a "correct" value if the age is 0 (0 is Ok, but not a negative number).*/
    @Override//override the convertYears method as described in 1. below,
    int convertYears(){
            int AgeInHuman = 0;
            int AgeInCat = super.calcAge();
            
            if(AgeInCat == 1){
            	AgeInHuman = 15;
            }
            if(AgeInCat > 1){
            	AgeInHuman = 24 + (AgeInCat - 2) * 4;
            }else{
            	AgeInHuman = 0;
            }
            return AgeInHuman;
    }
    
    /*
    2.The speak method returns:
    Cat: "meow" if the Cat is an indoor cat, "MEOW" if the cat is NOT an indoor cat*/
    @Override//override the speak method** as described in 2. below, 
    String speak(){
            String speak = "meow";
            if(getIndoor()){
            	return speak.toLowerCase();//Cat: "meow" if the Cat is an indoor cat(true)
            } else{
                return speak.toUpperCase();//Cat: "MEOW" if the cat is NOT an indoor cat(false)
            }
    }
   
    /*-- In the toString (Pet, Cat and Dog) and speak (Dog) methods, in such a way that LESS GARBAGE is created (i.e., in these methods!)
     * (which will include the info returned by its superclass' toString and the subclass' variable, 
     * BUT NOT convertYears( ) value and NOT speak() value!)*/
    @Override//and toString method** 
    public String toString(){
           
    	if(getIndoor()){
    	return "Cat Pet: " +super.toString()+"Indoor";
    	} else{
    		return "Cat Pet: " +super.toString()+"Not Indoor";
    	}
    }
}