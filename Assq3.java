class Assq3
{
	public static void main(String args[])
	{
		int x=2;
		int y=x*x + 3*x -7;
		System.out.println(y);
		y= x++ + ++x;
		System.out.println(y);
		System.out.println(x);
		int z=x++ - --y - --x + x++;
		System.out.println(z);
		System.out.println(x);
		System.out.println(y);

		boolean b1=true;
		boolean b2=false;
		boolean z1=b1 && b2|| !(b1 || b2);
		System.out.println(z1);
	}
}