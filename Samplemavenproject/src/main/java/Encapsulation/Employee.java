package Encapsulation;

public class Employee {
	
	private String name;
	private long accntnum;
	private String emailid;
	
	public void setter(String name,long accntnum,String emailid)
	{
		this.name = name;
		this.accntnum = accntnum;
		this.emailid= emailid;
	}
	public void getter()
	{
		System.out.println(name+" "+accntnum+" "+emailid);
	}
	

}
