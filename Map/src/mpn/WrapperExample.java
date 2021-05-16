package mpn;

public class WrapperExample {
	
	
	public static void main(String[] args) {
		
		int a =10;
		
//		Integer i = new Integer(10);
		
//		Integer i =10;
		
		Integer i = Integer.valueOf(10);
		
		String value= i.toString();
		
		System.out.println(i);
		
		System.out.println(value);
		
		System.out.println(i instanceof Integer);
		
		System.out.println(value instanceof String);
		
		int intValue=Integer.parseInt(value);
		
		System.out.println(intValue);
		
		Integer in = Integer.valueOf(intValue);
		
		System.out.println(in instanceof Integer);
		
		
		
		String age ="10";
		
		int agee=Integer.parseInt(age);
		
		System.out.println(agee);
		
		
//		int ab = new Integer(100);
		
		int ab = Integer.valueOf(100); //unboxing
		
		
		Integer abc = Integer.valueOf(1000);
		
		int abcd=abc.intValue();
		
		System.out.println(abcd);
		
		Boolean b = Boolean.valueOf(false);
		
		boolean result=b.booleanValue();
		
		System.out.println(result);
		
        	String valueee=b.toString();
        	
        	System.out.println(valueee);
        	
        	
        	System.out.println(valueee instanceof String);
        	
        	System.out.println(b instanceof Boolean);

		
	}
	
}
