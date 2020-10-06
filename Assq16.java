import java.util.Scanner;
class Ass16
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int b=sc.nextInt();
		for(int i=1; i<11; i++)
		{
			int table=b*i;
			System.out.println(table);
		}
	}
}