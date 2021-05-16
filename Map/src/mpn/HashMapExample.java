package mpn;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> mp= new HashMap <Integer,String> ();
		
		mp.put(1, "vicky");
		
		mp.put(2, "siva");

		mp.put(3, "naveen");

		mp.put(4, "vivek");

		mp.put(5, "vengi");
		
		System.out.println(mp);
		
		String name=mp.get(1);
		
		System.out.println(name);
		
		mp.remove(1);
        
		System.out.println(mp);
         
		System.out.println(mp.keySet());
		
		System.out.println(mp.values());
		
		System.out.println(mp.entrySet());
		
		System.out.println(mp.containsKey(2));
		
		System.out.println(mp.containsValue("vengi"));
		
		
		System.out.println(mp.containsKey(6));
		
		System.out.println(mp.containsValue("selva"));
		
		System.out.println(mp.size());
		
//		mp.clear();
		
//		System.out.println(mp);
	
		System.out.println(mp.isEmpty());
		
		Map<Integer,String> mpp= new HashMap <Integer,String> ();
		
		mpp.putAll(mp);
		
		mpp.put(6, "selva");
		
		System.out.println(mpp);
		
		
	}
	
	
	
	
	

}
