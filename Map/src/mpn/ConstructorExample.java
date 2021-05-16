package mpn;

public class ConstructorExample {
	
	int a=10;
	
	public ConstructorExample() {
		this(50);
		System.out.println(a);
	}
	
	public ConstructorExample(int b)
	{
		System.out.println(b);
	}
	
	public void add() {
		System.out.println(this.a);
	}
	
	
}
