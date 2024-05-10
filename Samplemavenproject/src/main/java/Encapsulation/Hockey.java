package Encapsulation;

public class Hockey extends Sports{

	String name;
	public void play(String name)
	{
		System.out.println("sports :" +name);
	}
	
	public static void main(String args[])
	{
		Sports s1 = new Cricket();
		Sports s2 = new Football();
		Sports s3 = new Hockey();
		s1.play("cricket");
		s2.play("football");
		s3.play("hockey");
		
	}
}
