package Programaddition;

public class Additionchildclass extends Additionofnumber{
	
	public void display()
	{
		int x = super.add();
		if(x % 10 ==0)
		{
			System.out.println(x+" is divisible by 10");
		}else {
			System.out.println(x+" is not divisible by 10");	
		}
	}
	public static void main(String[] args) {
		Additionchildclass obj = new Additionchildclass();
		obj.display();
	}

}
