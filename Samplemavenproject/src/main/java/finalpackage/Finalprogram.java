
package finalpackage;

public  class Finalprogram {
	
	final int a = 34;
	final int b; //blank final variable
	
	public Finalprogram()
	{
		b=20;
	}
	//b=45; we cannot chnage the value
	
	public final void show()
	{
		System.out.println("this is to display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalprogram obj = new Finalprogram();
		obj.show();
	}

}
