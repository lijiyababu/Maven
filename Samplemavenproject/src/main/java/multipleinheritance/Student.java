package multipleinheritance;

public class Student implements Interfaceone, Interfacetwo {

	public void display()
	{
		System.out.println("dsplay interface one mark"+mark);
	}
	public void print()
	{
		System.out.println("dsplay interface two mark"+marks);

	}
	
	public static void main (String args[]) {
		Student s = new Student();
		s.display();
		s.print();
	}
}
