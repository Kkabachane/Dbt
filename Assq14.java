import java.util.Scanner;
class Assq14
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year");
		int y=sc.nextInt();
		if((y%4)==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}		
	}
}