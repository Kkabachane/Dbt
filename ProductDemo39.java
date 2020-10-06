import java.util.Scanner;
class Product
{
	private int pid;
	private float price;
	private int quantity;
	Product()
	{

	}
	Product(int pid,float price,int quantity)
	{
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	static void cal(Product ar[])
	{
		double tot=0;
		for(Product a:ar)
		{
			tot=tot+(double)(a.price*a.quantity);
		}
		System.out.println("Total amount spent:"+tot);
	}
	void show()
	{
		System.out.println(pid+" "+price+" "+quantity);
	}
}
class ProductDemo39
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Product pr[]=new Product[5];
		for(int i=0;i<pr.length;i++)
		{
			System.out.println("Enter id, price and quantity");
			int id=sc.nextInt();
			float price=sc.nextFloat();
			int quantity=sc.nextInt();
			Product p=new Product(id,price,quantity);
			pr[i]=p;
		}
		/*float max=pr[0].price;
		Product p=new Product();
		for(Product a:pr)
		{
			a.show();
			if(a.price > max)
			{
				max=a.price;
				p=a;
			}
		}*/
		//System.out.println("Max product element:"+p.pid+" "+p.price+" "+p.quantity);
		Product.cal(pr);
	}
}