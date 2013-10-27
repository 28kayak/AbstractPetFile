
import java.util.Random;
public class DoubleMatrix
{
	
	private double[][] doubMatrix;
	
	public DoubleMatrix(int row, int col)
	{
		/*constructor with an int for the first dimension, and an int for the second dimension 
		 * and call the makeDoubMatrix private instance method (see below) Be sure to check if each parameter > 0 
		 * (if not, the best way to handle for now is to change the out-of- range parameter to 1)*/
		if(row<0)row=1;
		if(col<0)col=1;
		else makeDoubleMatrix(row, col);
	}
	
	public DoubleMatrix(double[][] doubMatrix)
	{
		/*another constructor with a 2-dim. array of doubles as its parameter. 
		 * Before you assign to the instance doubMatrix variable, check if parameter isn't null, if the length >0, 
		 * AND if each row has the same length as row 0 (you'll need a loop to check this), otherwise, 
		 * assign a new 1 X 1 2-dim. array with a random value >=0 and < 100 in the [0][0] element (could call makeDoubMatrix here).*/
		
		Random rand = new Random();
		
		if(doubMatrix != null && doubMatrix.length>0)
		{
			for(int i=0; i<doubMatrix.length; i++){
					
					if(doubMatrix[0].length != doubMatrix[i].length){
						doubMatrix= new double[1][1];
						doubMatrix[0][0] = rand.nextInt(100);
						
						}//if	
			}//for_i
		}else System.out.println("the array is not proper");
	}//DoubleMatrix
	
	private void makeDoubleMatrix(int row, int col)
	{
		/*private method (makeDoubMatrix) that does the same thing as getDoubMatrix (in Prog. HW #2), 
		 * but assigns the new 2-dim. array to the instance doubMatrix variable and has NO RETURN VALUE.*/
		double [][] doubMatrix = new double[row][col];
		
		for(int i=0; i<row;i++){
			for(int j=0; j<col;j++){
				doubMatrix[i][j] = (int)(Math.random() * (100.0-0.0+1) ) + 0.0;
			}
		}
	}
	
	public int getDim1()
	{
		/*public method to return the first dimension (how many "rows") called getDim1 (NOT an instance variable in this class,
		but use the length of doubMatrix!)*/
		
		return doubMatrix.length;
	}
	
	public int getDim2(){
		/*public method to return the second dimension (how many "columns" in one row) called getDim2 
		 * (NOT an instance variable in this class, 
		 * but use the 2nd dim. length of doubMatrix!)*/
		return doubMatrix[0].length;
	}
	
	public DoubleMatrix addMatrix(DoubleMatrix doubMatrix){
		/*public method (I'm calling it addMatrix) that has ONLY ONE PARAMETER for a DoubleMatrix to add this doubMatrix 
		 * (not changing this doubMatrix) and the parameter's doubMatrix and return a new DoubleMatrix that contains the result of adding. 
		 * Make sure you check if the dimensions of this doubMatrix and the parameter's doubMatrix are the same 
		 * (if not, return a new DoubleMatrix calling the first constructor passing 1, 1).*/
		
		//double[][] added = new double[doubMatrix.length][doubMatrix[0].length];
		DoubleMatrix added = new DoubleMatrix(this.getDim1(), this.getDim2());
		
		for(int i=0; i<this.doubMatrix.length;i++){
			for(int j=0; j<this.doubMatrix[i].length;j++){
				added.doubMatrix[i][j] = this.doubMatrix[i][j]+ this.doubMatrix[i][j];
			}}
		return added;
	}

	public double[][] getTransposedMatrix(){
	/*public method (I'm calling it getTransposedMatrix, NO PARAMETERS) 
	 * that creates the transposition of this doubMatrix (not changing this doubMatrix), 
	 * and returns the result in a new DoubleMatrix*/
		
		double [][] transposed = new double[this.doubMatrix[0].length][this.doubMatrix.length];
		
		for(int i=0;i<this.doubMatrix[0].length;i++){
			for(int j=0; j<this.doubMatrix.length;j++){
				transposed[i][j] = this.doubMatrix[j][i];
			}
		}
		
		return transposed;
	}
	
	public DoubleMatrix multiplyMatrix(DoubleMatrix doubMatrix){
	/*public method (I'm calling it multiplyMatrix) that has ONLY ONE PARAMETER
	 *  for a DoubleMatrix to multiply this doubMatrix (left operand) by the parameter's doubMatrix and return a new DoubleMatrix. 
	 *  Make sure you check if the 2nd dimension of this doubMatrix is the same as the parameter's doubMatrix's 1st dimension
	 *  (if not, return a new DoubleMatrix calling the first constructor passing 1, 1).*/
		DoubleMatrix multiply = new DoubleMatrix(this.getDim1(), this.getDim2());
		for(int i=0;i<this.doubMatrix.length;i++){
			for(int j=0; j<this.doubMatrix[i].length;j++){
				multiply.doubMatrix[i][j] = this.doubMatrix[i][j] * this.doubMatrix[i][j];
			}
		}
		
		return multiply;
	}

	public void printMatrix(String one){
		/*public method (I'm calling it printMatrix, one String parameter, no other parameters) that displays the String parameter, 
		 * then the doubMatrix to the screen*/
		System.out.println(one);
		for(int i=0; i<this.doubMatrix.length;i++){
			for(int j=0; j<this.doubMatrix[i].length;j++){
		System.out.println(this.doubMatrix[i][j]);
			}System.out.println("\n");
		}
		
	}



}
