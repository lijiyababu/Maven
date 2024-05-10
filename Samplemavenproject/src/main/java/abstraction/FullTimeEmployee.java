package abstraction;

public class FullTimeEmployee extends Employee  {
	int wrkhr =8;
	int pay=5000;
	public void Calculatesalary()
	{
		int payhr = pay*3;
		System.out.println("payment for full time employee "+payhr);
	}
	
	public static void main(String args[])
	{
		FullTimeEmployee obj = new FullTimeEmployee();
		obj.Calculatesalary();
		Contractor obj1 = new Contractor();
		obj1.Calculatesalary();
		
	}

}
