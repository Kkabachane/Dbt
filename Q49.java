import java.util.Scanner;
interface Taxable
{
	double salesTax=0.07;
	double incomeTax=0.105;
	void calTax();
}
class Employee implements Taxable
{
	int empId;
	String name;
	double salary;
	Employee()
	{}
	Employee(int empId,String name,double salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	public void calTax()
	{
		double incomeTax =salary * 0.105;
		System.out.println("Total incometax is:"+incomeTax);
	}
}
class Product implements Taxable
{
	int pid;
	int price;
	int quantity;
	Product()
	{}
	Product(int pid,int price,int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	public void calTax()
	{
		double salesTax=(price * quantity ) * 0.07 ;
		System.out.println("Total salesetax is: "+salesTax);
	}
}
class Q49
{
	public static void main(String args[])
	{
		Taxable t=new Employee(1,"ram",15000); 
		Taxable t1=new Product(1,400,5);
		t.calTax();
		t1.calTax();
	}
}