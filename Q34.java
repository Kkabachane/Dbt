import java.util.Scanner;
class Circle
{
	private int radius;
	private double area;
	private double pi=3.14;
	void init(int radius)
	{
		this.radius=radius;
	}
	
	void calArea()
	{
		area=pi*radius*radius;
	}
	void display()
	{
		System.out.println("radius=" +radius);
		System.out.println("area= " +area);
	}
}
class Q34
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		int rad=sc.nextInt();
		Circle c=new Circle();
		c.init(rad);
		c.calArea();
		c.display();
	}
}