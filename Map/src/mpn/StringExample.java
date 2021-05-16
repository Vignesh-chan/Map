package mpn;

import java.util.Date;

public class StringExample {
	
	public static void main(String[] args) {
		
		String s1 = "vignesh";
		
		String s2= "_chan";
		
//		String s3 = s1 + s2;
		
		String s3 = s1.concat(s2);
		
		System.out.println(s3);
		
		
		System.out.println(s3.length());
		
		
		System.out.println(s3.charAt(1));
		
		
		try
		{
		System.out.println(s3.toLowerCase(null));
		
		
		
		}
		catch(Exception e){
			System.out.println("Null pointer Exception");
					
		}
		
		System.out.println(s3.toUpperCase());
		
		String s4= s3.toUpperCase();
		
		char[] chars=s4.toCharArray();
		
		for(int i= s4.length()-1;i>=0;i--)
		{
			System.out.println(s4.charAt(i));
		}
		
		
		String s5= s4.toString();
		
		System.out.println(s5);
		
		System.out.println(s5.replace('v', 'u'));
		
		System.out.println(s5.replaceAll("_", "@"));
		
		
		System.out.println(s5.indexOf('H'));
		
		System.out.println(s5.indexOf("H", 1));
		
		
		String s6 = s5.substring(1,4);
		
		System.out.println(s6);
		
		String name ="malayalam";
		
		String revString="";
		
		for(int i= name.length()-1; i>=0;i--)
		{
			char revName=name.charAt(i);
			
			revString = revString+revName;
		}
		
		
		System.out.println(revString);
		
		
		StringBuffer sb1 = new StringBuffer("vicky");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer("chan");
		
		StringBuffer sb3 = sb1.append(sb2);
		
		System.out.println(sb3);
		
		
		
		
		
		StringBuffer sb4 = new StringBuffer("vickychan");
	 	
		System.out.println(sb1.equals(sb4));
		
		String s11=sb1.toString();
		
		
		 String s22 = sb4.toString();
		
		System.out.println(s11.equals(s22));
		
		
		StringBuffer sb5 = new StringBuffer("abcd");
		
		String name1 = "abcd";
		
		String name2 ="abcd";
		
		System.out.println(name1==name2);
		
		System.out.println(name1.contains("ab"));
		
		System.out.println(name1.contentEquals(sb5));
		
		
		Date d = new Date();
		System.out.println(d);
		
		String d1 = d.toString();
		
		System.out.println(d1);
		
		String[] namee=d1.split(":");
		
		for(String ab:namee)
		{
			System.out.println(ab);
		}
		
		System.out.println(d1.replaceAll(":", "-"));
	}
	
	
}