import java.util.Scanner;
abstract class Processor
{
	int data;
	void showData()
	{
		System.out.println(data);
	}
	abstract void process();
}
class Factorial extends Processor
{
	void process()
	{
		int a=5;
		int sum=1;
		for(int i=1;i<=a;i++)
		{
			sum=sum*i;
		}
		data=sum;
	}
}
class circle extends Processor
{
	void process()
	{
		int r=5;
		double area;
		area=3.14f *r *r;
		data=area;
	}
}
class Q48
{
	public static void main(String args[])
	{
		Processor p=new Factorial();
		Processor p1=new circle();
		p.process();
		p1.process();
		p.showData();
		p1.showData();
	}
}