class A
{
	private int i;
	A()
	{
		System.out.println("no arg A");
	}
	A(int i)
	{
		System.out.println("Para arg A");
	}
}
class B extends A
{
	private int j;
	B()
	{
		
		super();
		System.out.println("no arg B");
	}
	B(int j)
	{
		
		super(j);
		System.out.println("Para arg B");
	}
}
class Q47
{
	public static void main(String args[])
	{
		//A a=new B();
		B b=new B();
		B b1=new B(10);
	}
}