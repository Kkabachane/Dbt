
class MathOperation
{
	static int add(int i,int j)
	{
		int a=i+j;
		return a;
	}
	static int subtract(int i,int j)
	{
		int b=i-j;
		return b;
	}
	static int multiply(int i,int j)
	{
		int c=i*j;
		return c;
	}
	static int power(int i,int j)
	{
		int d=(int)Math.pow(i,j);
		return d;
	}
}
class Q35
{
	public static void main(String args[])
	{
		int a=MathOperation.add(3,2);
		System.out.println(a);
		int b=MathOperation.subtract(8,5);
		System.out.println(b);
		int c=MathOperation.multiply(3,4);
		System.out.println(c);
		int d=MathOperation.power(2,2);
		System.out.println(d);
	}
}