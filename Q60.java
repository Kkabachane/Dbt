import java.util.Scanner;
interface StudentFee
{
	void getFee();
}
class Student implements StudentFee
{
	String name;
	double fees;
	Student(String name,double fees)
	{
		this.name=name;
		this.fees=fees;
	}
	public void getFee() 
	{
		System.out.println(name+ " " + fees);
	}
}
class Q60
{
	public static void main(String args[])
	{
		Student s=new Student(name,fees);
		Scanner sc=new Scanner(System.in);
		//try{
			System.out.println("Enter name");
			String s=sc.next();
			System.out.println("Enter fees");
			double d=sc.nextDouble();
			s.getFee();
			//if(d<0)
			//{
				System.out.println();
			//}
	}
	
}