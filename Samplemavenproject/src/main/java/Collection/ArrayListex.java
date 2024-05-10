package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayListex {
	
	public static void main(String args [])
	{
	
		List l1 = new ArrayList();
		l1.add("apple");
		l1.add(22);
		l1.add(44);
		l1.add(22);
		l1.add(null);
		l1.add(null);
		System.out.println("generic list elements"+l1);
		System.out.println("generic list elements "+l1.size());
		System.out.println("check  list elements "+l1.isEmpty());
		System.out.println("check elements "+l1.contains("apple"));
		System.out.println("elements check null"+l1.remove("apple"));
		System.out.println("print"+l1);
		ArrayList l2= new ArrayList();
		l2.add("string");
		l2.add(122);
		System.out.println("list elements"+l2);
		System.out.println("list elements "+l2.size());
		
		System.out.println("remove elements "+l2.remove("string"));
		System.out.println("print data"+l2);
		
		ArrayList <String> l3 = new ArrayList <String>();
		l3.add("test");
		l3.add("check");
		System.out.println("generic collection "+l3);
		
		ArrayList <Integer>l5 = new ArrayList <Integer> ();
		l5.add(100);
		l5.add(102);
		Iterator <Integer> i =l5.iterator();//iterator 
		while(i.hasNext())
		{
			System.out.println(i.next());//next() return all elments in loop
		}
		i.remove();//remove last element in loop
		System.out.println(l5);
	}
	
}
