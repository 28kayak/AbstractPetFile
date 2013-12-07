package LastHW;

public class Dog extends Pet{
    private int tricks;//Dog will have a private instance variable for # of tricks (int). 
    
    public Dog(String name, int birthyear, int tri){
   	 super(name, birthyear);
   	 setTricks(tri);
   	 }//constructor_1
    
    public Dog(){
   	 super.name = "";//if you change name in superclass to private, you need to edit as set(name).
        super.birthyear = 0;//same here 
        tricks = 0;
    	}//constructor_2
    
    public int getTricks(){ return tricks; }//accessors for only the subclass' variables, 
    public void setTricks(int tri){ tricks = tri; }//mutators for the subclass' variable, 
    
  //In the Dog class, calculate and return (in a return statement)
    //the equivalent human years using the rules: 1 dog year is 9 human years, add 7 years for every year over 1. 
    //Make sure you return a "correct" value if the age is 0 (0 is Ok, but not a negative number).
    @Override
    int convertYears(){
        int AgeInHuman = 0;
        int AgeInDog = super.calcAge();
        
        if(AgeInDog > 0){
        	AgeInHuman = 9 + (AgeInDog - 1) * 7;
        }else{
        	AgeInHuman = 0;
        }
        return AgeInHuman;
}
    /*
    2.The speak method returns:
    Dog: "Woof" the number of times the numTricks has (for example if numTricks is 3, this returns "Woof Woof Woof" (put a space between each Woof)*/
    @Override//override the speak method** as described in 2. below, 
    String speak(){
            String speak = "";
            for(int i=0; i<tricks;i++){
           	 speak += "Woof ";
            }//for
            return speak.trim();//used trim() to get rid of the space at the end
    }
    
    /*-- In the toString (Pet, Cat and Dog) and speak (Dog) methods, in such a way that LESS GARBAGE is created (i.e., in these methods!)
     * (which will include the info returned by its superclass' toString and the subclass' variable, 
     * BUT NOT convertYears( ) value and NOT speak() value!)*/
    @Override
    public String toString(){
   	 return "Dog Pet: " +super.toString()+"# tricks="+tricks;
    }
}