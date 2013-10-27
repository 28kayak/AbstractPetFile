
public class Program3 {/*
 * calling ONLY DoubleMatrix instance methods (except to get the 2 random dimensions) IN THIS EXACT ORDER:*/
	public static void main(String[] args){
  /*Get the first and second dimensions the same way as in Prog. HW#2 (using the random method)
	Instantiate a DoubleMatrix passing the first and second dimensions you just assigned and assign it to doubMatObj1
	Instantiate a DoubleMatrix passing the return value of doubMatObj1's getDim1 and getDim2 and assign it to doubMatObj2
	
	Call addMatrix on doubMatObj1 passing doubMatObj2, assigning the return value to doubMatObj3
	
	Call printMatrix on doubMatObj1 passing "First Matrix Object"
	Call printMatrix on doubMatObj2 passing "Second Matrix Object"
	Call printMatrix on doubMatObj3 passing "Result of Adding Matrix Objects"
	
	Call getTransposedMatrix on doubMatObj2, and assign return value back to doubMatObj2
 	Call printMatrix on doubMatObj2 passing "Result of Transposing Matrix Object"
	
	Call multiplyMatrix on doubMatObj1 passing doubMatObj2, assigning the return value to doubMatObj3
	Call printMatrix on doubMatObj3 passing "Result of Multiplying Matrix Objects"*/	
	
		//get row and col # between 3 and 10
		int row = (int)(Math.random() * (10-3)+4);
		int col = (int)(Math.random() * (10-3)+4);
		
		System.out.println("row = " + row);
		System.out.println("col = " + col);
		DoubleMatrix doubMatObj1 = new DoubleMatrix(row, col);
		if(doubMatObj1 != null)System.out.println("not null");
		
		System.out.println(doubMatObj1.getDim2());
	    DoubleMatrix doubMatObj2 = new DoubleMatrix(doubMatObj1.getDim1(), doubMatObj1.getDim2());
	    
	    DoubleMatrix doubMatObj3 = doubMatObj1.addMatrix(doubMatObj2);
		
	    doubMatObj1.printMatrix("First Matrix Object");
	    doubMatObj2.printMatrix("Second Matrix Object");
	    doubMatObj3.printMatrix("Result of Adding Matrix Object");
		
	    doubMatObj2.getTransposedMatrix();
	    doubMatObj2.printMatrix("Result of Transposing Matrix Object");
	    
	    doubMatObj3 = doubMatObj1.multiplyMatrix(doubMatObj2);
	    doubMatObj3.printMatrix("First Matrix Object");
	    
	}//main
	
}
