import java.util.Scanner;
class Assq15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter either person M or F");
		String s=sc.next();
		System.out.println("enter age");
		int a=sc.nextInt();
		if(a>=21)
		{
			System.out.println("Person can marry");
		}
		else
		{
			System.out.println("Person cant marry");
		}
	}
}