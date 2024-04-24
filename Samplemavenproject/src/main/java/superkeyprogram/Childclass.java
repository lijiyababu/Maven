package superkeyprogram;

public class Childclass extends Superkeyparent {
	int a =33;
	int b =40;
	public Childclass(int a, int b)
	{
		super(20, 30);
		System.out.println("childclass");
	}
	public void display()
	{
		super.display();
		
		System.out.println(a);
		System.out.println(super.a);
		System.out.println("display childclass method");
	}
	public static void main(String args[])
	{
		Childclass obj = new Childclass(24, 30);
		obj.display();
	}
}
