package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class DemoCollections {
public static void main(String[] args) {
	Set<Integer> s=new HashSet<>();
	s.add(1);
	s.add(4);
	s.add(2);
	s.add(657);
	s.add(4);
	s.add(10);
	s.add(34);
	s.add(-3);
	s.add(2);
	s.add(5);
	s.remove(-3);
	//System.out.println();
	//s.add();
	//s.add(null);

	/*Iterator<Integer> iter=s.iterator();
	while(iter.hasNext())
	{
		System.out.println(iter.next());
		
	}
		
	s.clear();
	for(Integer i:s)
	{
		System.out.println(i);
	}*/
	
	List<Integer> l=new ArrayList<>();
l.add(1);
l.add(3);
l.add(null);
l.add(2, 6);
l.add(2);
l.add(2);
System.out.println("list");
System.out.println(l.get(2));
//l.remove(1);
//System.out.println(l);

	
	Map<Integer, Integer> m=new LinkedHashMap<>();
	m.put(3, 245);
	m.put(4, 45);
	m.put(1, 745);
	m.put(3, 245);
	m.put(0, 245);
	
	m.put(2, 485);
	m.put(345, 45);
	//m.put(null,987);
	m.remove(2);
	m.put(7, 245);
	//Collections.so
	
	m.put(73, 245);
System.out.println("my ele is "+m.get(1));
	//System.out.println(m);
	/*for(Map.Entry<Integer, Integer> entry :m.entrySet())
	{
		System.out.println("_________________");
		System.out.println(m.get(3));
		System.out.println(ent.getKey());
		System.out.println(ent.getValue());
	}*/
	/*Set<Integer> se=m.keySet();
	for(Integer in:se)
		if(in==4)
		System.out.println(m.get(in));*/

	Set<Integer> se=m.keySet();
	for(Integer in:se){
	System.out.println(in);
		System.out.println(m.get(in));}
}
}
