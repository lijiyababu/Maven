package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class ForloopCollection {

	public static void main(String args[])
	{
		List <String>l1 = new ArrayList();
		l1.add("blue");
		l1.add("green");
		l1.add("brown");
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));//get data
		}
		for(String listdata : l1)
		{
			System.out.println(listdata);
		}
		System.out.println(l1.get(2));
		System.out.println(l1.set(2, "black"));//replace the 2nd index
		System.out.println(l1);
		
		Collections.sort(l1);
		System.out.println("sorted list"+l1);
		ArrayList <String> l2= new ArrayList <String>();
		l2.add("test");
		l1.addAll(l2);
		System.out.println(l1);
		l1.removeAll(l2);//remove all
		System.out.println(l1);
		
		ArrayList <Integer> l3= new ArrayList <Integer>();
		l3.add(12);
		l3.add(13);
		l3.add(143);
		System.out.println(l3);
		ArrayList <Character> l4= new ArrayList <Character>();
		l4.add('a');
		l4.add('b');
		System.out.println(l4);
		System.out.println("print iterator----------------");
		Iterator i =l3.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}
}
