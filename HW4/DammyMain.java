package HW4;

public class DammyMain 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Pet[] pets = new Pet[5];
		pets[0] = new Cat("Mike",2011,true);
		pets[1] = new Dog("Pochi",2000);
		pets[2] = new Cat("Tama",1990,false);
		pets[3] = new Cat("Sushi",2013, true);
		pets[4] = new Dog("Hachi",1999);
		
		for(int index = 0; index < pets.length; index++)
		{
			System.out.println(pets[index].toString());
		}

	}

}
