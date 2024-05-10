package Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
public class Setprogram {
	
	public static void main(String args[])
	{
	HashSet <Integer> s1 = new HashSet <Integer>();
	s1.add(100);
	s1.add(455);
	s1.add(100);//unique elements
	System.out.println(s1);
	
	HashSet s4 = new HashSet();
	s4.add(44);
	s4.add("keerthi");
	System.out.println(s4);
	Iterator <Integer> i =s1.iterator();//iterator 
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	i.remove();
	System.out.println(s1);
	s4.remove("Keerthi");
	System.out.println(s4);
	s4.addAll(s1);
	System.out.println(s4);
	s4.removeAll(s1);
	System.out.println(s4.size());
	System.out.println(s4.contains(44));
	
	LinkedList <String> l3 = new LinkedList <String>(); //linked list
	l3.add("aa");
	l3.add("bb");
	System.out.println(l3);
	l3.remove("aa");
	System.out.println(l3);
	l3.addFirst("cc");
	System.out.println(l3);
    l3.addLast("dd");
    System.out.println(l3);
	}

}
