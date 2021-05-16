package mpn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue <String>list = new PriorityQueue<String>();
		
		list.add("vicky");
		list.add("naveen");
		list.add("siva");
		list.offer("vivek");
		list.offer("vengi");
		list.offer("selva");
		
		
		System.out.println(list);
		
		System.out.println(list.element());
		System.out.println(list.peek());
		System.out.println(list.peek());
		
		
	   System.out.println(list.remove());
	   
	   Iterator <String>itr = list.iterator();
	   
	   while(itr.hasNext())
	   {
		   String value=itr.next();
		   System.out.println(value);
		   if(value.equals("naveen"))
		   {
			   itr.remove();
		   }
		   
	   }
	   
		System.out.println(list);
		
	   List<String> ls = new ArrayList<String>(list);
	   
	   ls.add(5, "naveen");
	   
	   ls.set(4, "vickyy");
	   
	   System.out.println(ls);
	   
	   for(int i=ls.size()-1; i>=0;i--)
	   {
		   System.out.println(ls.get(i));
	   }
	
	   System.out.println(ls);
	
	}
	
	
	
	
	
	

}
