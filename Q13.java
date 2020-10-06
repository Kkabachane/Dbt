import java.util.Scanner;
class Q13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		/*if(a>b && a>c)
		{
			System.out.println(a+ "greatest");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" greatest");
		}
		else
			System.out.println(c+ "greatest");*/
		String s=(a>b && a>c)?"a is greater":(b>a && b>c)?"b is greater":"c is greater";
		System.out.println(s);
	}
}