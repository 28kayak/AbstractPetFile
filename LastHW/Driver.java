///////////////////////////////////////////////////////////////
//Programming Assignment5
//Haruki Taguchi
//11/24/2013
//mac, eclipse
//This is a code that manages pets' information
//Input information: how many pets, then,
//Input: dog/cat, name, birth year, tricks if dog, true/false if cat is indoor/outdoor
//then, two objects, cat and dog will deal with those info
//output in Driver class
//See UML.
///////////////////////////////////////////////////////////////
package LastHW;
import java.util.Scanner;
public class Driver
{
	static Scanner scan = new Scanner(System.in);
	//In main, declare an array of Pet objects, then do call the following static methods:
	public static void main(String [] args)
	{	
		//Scanner intScan = new Scanner(System.in);
		
			
			/*Previous HW style
             Pet[] p = createArray();
             //sort(p);
             print(p);
             //countCat(p); 
             */
    }//end main
	
        //a method that returns (in a return statement) an array of Pet objects. 
        //In this method, read the size of array from the user, (don't allow < 1 or > 50)* allocate memory for the array, 
        //assign to each element the return value from a static method that reads and PARSES the input (in another method, see A. below).
        public static Pet[] createArray(){
                Scanner scan = new Scanner(System.in);
                int size = 0;
                while(size < 1 || size > 50){
                	System.out.println("Enter number of pets: ");
                	size = scan.nextInt();
                }
                Pet[] pets = new Pet[size];
                for(int i=0; i<size; i++){
                	//System.out.println("Enter dog/cat, name, birth year, tricks if dog, true/false if cat is indoor/outdoor");
                	pets[i]= readParse();
                }
                return pets;
        }//createArray
        
/*A.In the method that reads and parses the input, read into a String, tokenize (using a StringTokenizer or split method in the String class),
  convert the tokens into the expected types based on whether it's a Dog or Cat,
  and return an instance of Dog or Cat based on the tokens (converted if needed, could use Integer.parseInt(str) and Boolean.parseBoolean(str)). 
  See examples of input on Catalyst.*/
        public static int count =0;
        public static Pet readParse(){
        	Scanner scan = new Scanner(System.in);
        	String info = scan.nextLine();
        	String[] tokens = info.split(",");
        	for(int i=0;i<tokens.length;i++){
        	tokens[i] = tokens[i].trim();
        	}
        	if(tokens[0].toLowerCase().equals("cat")){
        		Pet cat = new Cat(tokens[1], Integer.parseInt(tokens[2]),Boolean.parseBoolean(tokens[3]));
        		if(Boolean.parseBoolean(tokens[3])){ count++;}
        		return cat;	
        		}
        	if(tokens[0].toLowerCase().equals("dog")){
        		Pet dog = new Dog(tokens[1], Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]));
        		return dog;
        		} else{ 
        			System.out.println("It's not a cat or dog. It's null");
        			return null;
        		}
        }
        
        //a method to sort the array by name (be sure to use the length variable of the array), 
        //using the String class' compareToIgnoreCase method.
        static void sort(Pet[] pets){}
        
         //a method that prints each object's toString AND the return value from convertYears
         //AND return value from speak in an enhanced for loop. 
         //THERE ARE NO IF STATEMENTS NOR CONDITION/TERNARY OPERATORS IN THIS METHOD!
        static void print(Pet[] pets){
                for(int index = 0; index < pets.length; index++){
                        System.out.println(pets[index].toString() 
                        		+"\nHuman Years = "+ pets[index].convertYears()
                                +", Says " +pets[index].speak());
                }
                System.out.println("There is/are"+count+"indoor cat(s)");
        }
        
        //a method to return how many Cats in the array (if any) are indoor Cats (described in B. below)
        //If the return value is >= 0, print the how many cats are indoor cats, or if it is -1, print "No cats".
/*B.In the method that finds how many Pets in the array are indoor cats,
  traverse the array USING A LOOP and USING THE instanceof operator in the proper place. 
  Return the number of Pets in the array that are indoor cats, but return -1 if there are NO cats. 
  You'll need a separate variable to indicate if there are any cats.
  You'll need to use the cast operator in this method.
  DON'T PRINT IN THIS METHOD.*/
        static int countCat(Pet[] pets){
                int num = 0;
                for(int i = 0; i < pets.length; i++){
                   if(pets[i] instanceof Cat){
                	   
                   }//if
                }//for
                return num;
        }
}
//output
/*Enter number of pets: 
6
dog,Titan Great Dane,2009,5
Dog,Tuffy Terrier,2006,4
Cat,PURR Kitten,2001,true
Cat,Zip Cat,2005,false
Cat,Amber Tabby,2000,true
dog,Fetch Retriever,2011,10
Dog Pet: Name=Titan Great Dane, Birth year=2009# tricks=5
Human Years = 30, Says Woof Woof Woof Woof Woof
Dog Pet: Name=Tuffy Terrier, Birth year=2006# tricks=4
Human Years = 51, Says Woof Woof Woof Woof
Cat Pet: Name=PURR Kitten, Birth year=2001Indoor
Human Years = 64, Says meow
Cat Pet: Name=Zip Cat, Birth year=2005Not Indoor
Human Years = 48, Says MEOW
Cat Pet: Name=Amber Tabby, Birth year=2000Indoor
Human Years = 68, Says meow
Dog Pet: Name=Fetch Retriever, Birth year=2011# tricks=10
Human Years = 16, Says Woof Woof Woof Woof Woof Woof Woof Woof Woof Woof
There is/are2indoor cat(s)*/