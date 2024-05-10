package Collection;

import java.util.ArrayList;

public class CollectionAssignment {
	
	public static void main(String args[])
	{
		ArrayList<String> l1 = new ArrayList <String> ();
		l1.add("violet");
		l1.add("Indigo");
		l1.add("Blue");
		l1.add("Green");
		System.out.println("print array list :"+l1);
		System.out.println("print element in 2nd index :"+l1.get(2));
		System.out.println("ITERATE all elements");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));//get data
		}
		System.out.println("remove 3rd element "+l1.remove(3));
		System.out.println(l1);
		System.out.println("check element Blue present or not :"+l1.contains("Blue"));
	}

}
