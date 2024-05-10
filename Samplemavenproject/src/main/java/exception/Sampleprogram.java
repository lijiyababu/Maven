package exception;

public class Sampleprogram {
	
	public static void main(String args[])
	{
		int a=22;
		float b= 3.3f;
		int array[]= new int[4];
		try {
		//	float c = a/0;
			array[5] =34;
		}
		/*catch(ArithmeticException e)
		{
			System.out.println(" print the statement");
		}*/
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" print the array statement");
		}*/
		/*catch(Exception e)
		{
			System.out.println("parent exception");
		}*/
		finally {
			System.out.println("final block");//always execute the necessary code of program
		}
		System.out.println("end block");
		
	}

}
