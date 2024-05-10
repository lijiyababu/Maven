package exception;

public class License2 {
	
	public static void checkage(int age) throws LicenseException
	{
		if(age<18)
		{
			throw new LicenseException("not eligible");
		}else {
			System.out.println("License Approved");
		}
	}
	public static void main(String args[] ) throws LicenseException
	{
		checkage(2);
	}

}
