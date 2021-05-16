package mpn;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
	
	public static void main(String[] args) {
		
		Map<Integer,String> map = new TreeMap<Integer,String>(Collections.reverseOrder());
		
        map.put(1, "vicky");
		
		map.put(2, "siva");

		map.put(3, "naveen");

		map.put(4, "vivek");

		map.put(5, "vengi");
		
		System.out.println(map);

		
	}

}
