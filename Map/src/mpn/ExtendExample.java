package mpn;

public class ExtendExample extends ConstructorExample {
	
	int a= 20;
	int b=30;
	
	
	public ExtendExample()
	{
		super();
		System.out.println("abacana");
		
	}
	
	public ExtendExample(String name)
	{
		super();
		System.out.println(name);
	}
	
	public void method()
	{
		System.out.println(this.a);
		
		System.out.println(this.b);
		
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		
		ExtendExample cx= new ExtendExample("vicky");
		
		cx.method();	
	}
}
