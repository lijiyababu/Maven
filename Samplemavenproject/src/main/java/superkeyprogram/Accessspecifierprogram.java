package superkeyprogram;

public class Accessspecifierprogram {
	 protected int numb = 23;
	protected void add()
	{
		
		System.out.println("num is "+numb);
	}
	public static void main(String args[])
	{
		Accessspecifierprogram obj = new Accessspecifierprogram();
		obj.add();
	}

}
