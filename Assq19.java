import java.util.Scanner;
class Ass19
{
    public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
        	for(int i=12; i<=n; i=i+10)
		{
			System.out.print(i);
			if(i<n)
			System.out.print(" + ");
			sum=sum+i;
		}
	 }
}