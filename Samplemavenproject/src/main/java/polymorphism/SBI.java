package polymorphism;

public class SBI extends Bankclass {
	
	public void display(String name)
	{
		super.display("parent");
		name = "SBI child";
		System.out.println(""+name);
	}
	public void showSBI() {
		super.showparent();
		System.out.println("to show child SBI");
	} 

	public static void main(String[] args) {
		
		SBI obj = new SBI();
		Bankclass obj1 = new SBI();//upcasting
		obj1.display("child class");
		obj.showSBI();
		//obj1.showparent();

	}

}
