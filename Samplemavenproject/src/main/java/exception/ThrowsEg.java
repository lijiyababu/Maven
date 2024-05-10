package exception;

public class ThrowsEg {
	
	public static void print() throws ArithmeticException
	{
		throw new ArithmeticException("Exception occured");
	}
	public static void main(String args[] ) throws ArithmeticException
	{
		ThrowsEg obj = new ThrowsEg();
				obj.print();
	}
}
