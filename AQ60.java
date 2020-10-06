import java.util.Scanner;
interface StudentFee
{
	void getFee();
}
class Student implements StudentFee throws Exception{
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
class AQ60
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Student s=new Student( n,f);
		try{
			System.out.println("Enter name");
			String st=sc.next();
			System.out.println("Enter fees");
			double d=sc.nextDouble();
			s.getFee();
			if(d<0)
			{
				System.out.println("Invalid fee");
			}
		}catch(IOException e){
			System.out.println(e);
	}
	
}