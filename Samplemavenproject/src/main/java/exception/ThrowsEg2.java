package exception;
import java.io.IOException;
public class ThrowsEg2 {
	public static void display() throws IOException
	{
		throw new IOException("Exception occured");
	}

	public static void main(String args[])
	{
		try {
			display();
		}
		catch(IOException e)
		{
			System.out.println("exception");
		}
	}
}
