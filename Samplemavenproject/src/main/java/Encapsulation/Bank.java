package Encapsulation;

public class Bank {
	private int pin;
	
	public void setter(int pin) {
		
		this.pin = pin;
	}
	
	public void getter()
	{
		System.out.println(pin);
	}
	public void validatepin(int pin)
	{
		if(pin == 1001 || pin ==1234 || pin == 1212)
		{
			System.out.println("pin is valid");
		}else {
			System.out.println("pin is not valid");
		}
		
	}
}
