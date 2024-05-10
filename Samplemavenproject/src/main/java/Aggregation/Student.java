package Aggregation;

public class Student {
	String stname;
	int rollno;
	int division;
	Address a;
	public Student(String stname, int rollno, int division,Address a)
	{
		this.stname= stname;
		this.rollno = rollno;
		this.division = division;
		this.a= a;
	}
	
	public void display()
	{
		System.out.println("student name "+stname);
		System.out.println("student rollno "+rollno);
		System.out.println("student division "+division);
		System.out.println("student address "+a.housename);
		System.out.println("student house no "+a.houseno);
		System.out.println("student house pincode "+a.pincode);
	}

	public static void main(String[] args) {
		Address obj = new Address("house",123,689693);
		Student obj1= new Student("nathan",34,1,obj);
		obj1.display();
	}

}
