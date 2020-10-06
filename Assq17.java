import java.util.Scanner;
class Ass17
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		int rev=0;
		while(a!=0)
		{
			int b=a%10;
			rev=rev*10+b;
			a=a/10;
		}
		System.out.println(rev);
	}
}