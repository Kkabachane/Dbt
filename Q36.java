import java.util.Scanner;
class MathOpe
{
	int multiply(int a,int b)
	{
		int p=a*b;
		return p;
	}
	float multiply(float a,float b,float c)
	{
		float q=a*b*c;
		return q;
	}
	int multiply(int arr[])
	{
		int c=1;
		for(int i=0;i<arr.length;i++)
		{
			return c=c *  arr[i];
		}
		System.out.println("c=" +c);
	}

	double multiply(double a,int b)
	{
		double s=(double)(a*b);
		return s;
	}

}
class Q36
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MathOpe m=new MathOpe();
		m.multiply(4,5);
		m.multiply(1.0F,2.0F,3.0F);
		m.multiply(5.0,5);
		int arr[]=new int[3];
		System.out.println("Enter ele");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		m.multiply(arr);
	}
}