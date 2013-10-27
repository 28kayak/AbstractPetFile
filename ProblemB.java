
public class ProblemB {

public static void main(String args[])
{

	double e = 0.0f;
	double[] arr = new double[30];
	arr[0]=1;
	arr[1] = 1;
	int i=0;

	for(i=2; i<=25; i++)
	{
		arr[i] = i* arr[i-1];
		//System.out.println(arr[i]);
	}

	for(i=2; i<=25; i++)
	{
		System.out.println("arr = " + arr[i]);
	}

	for(i=2; i <= 25; i++)
	{
		if(1/arr[i]< 0.0000000001) e+= 1/arr[i];
		else i = 100;
	}
	System.out.println("e=" + e);
}

}

/*

Write another Java application program to find and display an approximation of e (natural logarithm). 



Use the following approximation formula starting with n as 2, incrementing by 1 until two 

successive values of e differ by less than 0.0000000001 and display not 

only the approximation, but how many terms of n were used in the last 

approximation. 

The formula is: approximation of e = 1/0! + 1/1! + 1/2! + 1/3! + ... , where n! is n factorial 



Note: n factorial is n*(n-1)*(n-2)*...*2*1, and 0! is 1 



You MUST include in this program: 

1. for loops 

2. static final constant for 0.0000000001 

3. Optional: a static method called from main 

DO NOT USE CLASS-SCOPE VARIABLES unless they're final and static. 

Do not use any input for these programs! 

*/