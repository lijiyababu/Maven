package abstraction;

public class Contractor extends Employee {
		int wrkhr;
		int pay =4000;
		public void Calculatesalary()
		{
			int payhr = pay*3;
			System.out.println("payment for contractor "+payhr);
		}
}
