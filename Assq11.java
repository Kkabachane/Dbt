class Assq11
{
	public static void main(String args[])
	{
		int i=10;
		int j=20;
		System.out.println("Before swapping value of i= "+i+" value of j= "+j);
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("After swapping value of i= "+i+" value of j= "+j);
	}
}