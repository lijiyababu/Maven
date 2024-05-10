package exception;

public class Exceptionthrow {
	
	public static void Check(int a, int b)
	{
		int sum = a+b;
		if(sum<30)
		{
			throw new ArithmeticException ("sum is greater than 30");
		}
	}
	
	public static void main(String args[])
	{
		try {
			Check(23,1);
		}
		catch(ArithmeticException e)
		{
			System.out.println("sum is less than 30");
		}
		//Exceptionthrow.Check(33, 33);
	}

}
