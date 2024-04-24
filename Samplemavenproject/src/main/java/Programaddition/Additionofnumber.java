package Programaddition;
import java.util.Scanner;
public class Additionofnumber {
	int a;
	int b;
	public int add()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter first value");
		a = obj.nextInt();
		System.out.println("Enter second value");
		b = obj.nextInt();
		int c = a+b;
		System.out.println("sum of 2 number is "+ c);		
		return c;
	}

}
