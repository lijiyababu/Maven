package interfacepackage;
import java.util.Scanner;
public class HDFC implements RBI {

	int depamnt;
	public void RecurringDeposit(int depamnt, int duration)
	{
		double permonth = (depamnt*interestrate)/12;
		double totalamount =permonth*duration*12;
		System.out.println(totalamount);
		
	}
	public static void main(String args[])
	{  
		RBI obj = new HDFC();
		System.out.println("Enter deposit amount");
		Scanner s = new Scanner(System.in);
		int depamnt = s.nextInt();
		System.out.println("interest rate is "+interestrate);
		System.out.println("duration in year ");
		int duration = s.nextInt();
		obj.RecurringDeposit(depamnt,duration);	
	}
}
