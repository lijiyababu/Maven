package abstraction;

public class Demo extends Sample {
	public void print()
	{
		System.out.println("implementation of absract method");
	}
	public static void main(String args[])
	{
		Demo obj = new Demo();
		obj.print();
		obj.display();
	}

}
