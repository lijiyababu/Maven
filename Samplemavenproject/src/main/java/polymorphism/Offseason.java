package polymorphism;
import java.util.Scanner;
public class Offseason {
	
	int disc;
	int amnt1;
	public void discount()
	{
		System.out.println("purchase clothes in offseason");
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter amount of cloth 1");
		amnt1 = obj.nextInt();
		int aftdisc = (amnt1*15)/100;
		int finalamnt = amnt1- aftdisc;
		System.out.println(finalamnt);
	}

}
