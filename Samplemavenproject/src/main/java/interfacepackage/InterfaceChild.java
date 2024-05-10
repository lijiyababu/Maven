package interfacepackage;

public class InterfaceChild implements Interfaceprogram{

	public void print()
	{
		System.out.println("Example for interface");
		System.out.println("Max value "+MAX_VALUE);
	}
	public void display() {
		System.out.println("Example for interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceprogram obj = new InterfaceChild();
		obj.print();
		obj.display();

	}

}
