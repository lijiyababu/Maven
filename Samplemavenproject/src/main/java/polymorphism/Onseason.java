package polymorphism;

import java.util.Scanner;

public class Onseason extends Offseason {

	int disc;
	int amnt1;
	public void discount()
	{
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter amount of cloth 2");
		amnt1 = obj.nextInt();
		int aftdisc = (amnt1*40)/100;
		int finalamnt = amnt1- aftdisc;
		System.out.println(finalamnt);
		
	}
	public static void main(String args[])
	{
		System.out.println("option 1 :offseason");
		System.out.println("option 2 :omseason");
		System.out.println("option 3 :exit");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter your option");
		int option = obj.nextInt();
		Onseason os = new Onseason();
		Offseason of = new Offseason();
		switch(option)
		{
		case 1:
			of.discount();
		case 2:
			os.discount();
		case 3:
			System.exit(0);
		
		}
			
		}
	
}
