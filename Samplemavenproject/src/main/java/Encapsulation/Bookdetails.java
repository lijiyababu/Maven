package Encapsulation;

public class Bookdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj = new Book();
		obj.setBookname("AA");
		obj.setBooknum(234);
		obj.setAuthor("ttt");
		System.out.println(obj.getBookname());
		System.out.println(obj.getBooknum());
		System.out.println(obj.getAuthor());

	}

}
