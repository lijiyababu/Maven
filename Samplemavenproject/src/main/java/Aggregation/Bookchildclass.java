package Aggregation;

public class Bookchildclass{
	
	String bookname;
	int bookno;
	Author a;
	public Bookchildclass(String bookname, int bookno, Author a)
	{
	 this.bookname = bookname;
	 this.bookno = bookno;
	 this.a = a;
	}
	
	public void display()
	{
		System.out.println("book name : "+bookname);
		System.out.println("book no : "+bookno);
		System.out.println("Author name : "+a.name);
		System.out.println("Author address : "+a.address);
		System.out.println("Author QID : "+a.qid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author obj1 = new Author("tt","fddfg",444);
		Bookchildclass obj = new Bookchildclass("aa",9,obj1);
		obj.display();
	}

}
